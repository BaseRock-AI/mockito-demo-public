package demo.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
@EnableWebMvc
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    @Test
    public void testGreetingWhenServiceReturnsGreetingThenReturnGreeting() {
        // Arrange
        String expectedGreeting = "Hello, I'm UserService";
        when(userService.greet()).thenReturn(expectedGreeting);

        // Act
        String actualGreeting = userController.greeting();

        // Assert
        assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    public void testFindByIdWhenUserExistsThenReturnUser() throws Exception {
        // Arrange
        User user = new User("1", "passwordHash", true);
        when(userService.findById("1")).thenReturn(user);

        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(get("/user/findById/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.passwordHash").value("passwordHash"))
                .andExpect(jsonPath("$.enabled").value(true));
    }

    @Test
    public void testFindByIdWhenUserDoesNotExistThenThrowUserNotFoundException() throws Exception {
        // Arrange
        when(userService.findById("1")).thenReturn(null);

        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(get("/user/findById/1"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testThrowsNotTreatedException() throws Exception {
        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(get("/user/throwsNotTreatedException"))
                .andExpect(status().isInternalServerError());
    }

    @Test
    public void testFindAllWhenUsersExistThenReturnUsers() throws Exception {
        // Arrange
        User user1 = new User("1", "passwordHash1", true);
        User user2 = new User("2", "passwordHash2", false);
        List<User> users = Arrays.asList(user1, user2);
        when(userService.findAll()).thenReturn(users);

        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(get("/user/all"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id").value("1"))
                .andExpect(jsonPath("$[0].passwordHash").value("passwordHash1"))
                .andExpect(jsonPath("$[0].enabled").value(true))
                .andExpect(jsonPath("$[1].id").value("2"))
                .andExpect(jsonPath("$[1].passwordHash").value("passwordHash2"))
                .andExpect(jsonPath("$[1].enabled").value(false));
    }

    @Test
    public void testFindAllIdsWhenUsersExistThenReturnUserIds() throws Exception {
        // Arrange
        List<String> userIds = Arrays.asList("1", "2");
        when(userService.findAllIds()).thenReturn(userIds);

        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(get("/user/allIds"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0]").value("1"))
                .andExpect(jsonPath("$[1]").value("2"));
    }

    @Test
    public void testCreateWhenUserIsValidThenCreateUser() throws Exception {
        // Arrange
        User user = new User("1", "passwordHash", true);
        doNothing().when(userService).create(user);

        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(post("/user/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":\"1\",\"passwordHash\":\"passwordHash\",\"enabled\":true}"))
                .andExpect(status().isOk());

        verify(userService, times(1)).create(any(User.class));
    }

    @Test
    public void testUpdateWhenUserIsValidThenUpdateUser() throws Exception {
        // Arrange
        User user = new User("1", "passwordHash", true);
        doNothing().when(userService).update(user);

        // Act & Assert
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        mockMvc.perform(post("/user/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":\"1\",\"passwordHash\":\"passwordHash\",\"enabled\":true}"))
                .andExpect(status().isOk());

        verify(userService, times(1)).update(any(User.class));
    }
}