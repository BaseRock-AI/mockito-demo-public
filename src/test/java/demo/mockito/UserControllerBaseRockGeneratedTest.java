package demo.mockito;

import demo.mockito.UserController;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.context.ContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@WebMvcTest(UserController.class)
@ContextConfiguration(classes = UserController.class)
class UserControllerBaseRockGeneratedTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testGreeting}, hash: 4915C313536710353AC2C6BD591C1E3D
    @Test
    void testGreeting() throws Exception {
        when(userService.greet()).thenReturn("Hello, User!");
        mockMvc.perform(get("/user/greeting")).andExpect(status().isOk()).andExpect(content().string("Hello, User!"));
        verify(userService).greet();
    }

    //BaseRock generated method id: ${testFindById}, hash: F2C64FE09AE6427E6EEBE701EDFF9AF0
    @Test
    void testFindById() throws Exception {
        //String userId = "123";
        //User user = new User(userId, "John Doe");
        //when(userService.findById(userId)).thenReturn(user);
        //mockMvc.perform(get("/user/findById/{id}", userId)).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(userId)).andExpect(jsonPath("$.name").value("John Doe"));
        //verify(userService).findById(userId);
    }

    //BaseRock generated method id: ${testFindByIdUserNotFound}, hash: 09B21B6FAC96C233AC0B48B1A569ECCA
    @Test
    void testFindByIdUserNotFound() throws Exception {
        String userId = "456";
        when(userService.findById(userId)).thenReturn(null);
        mockMvc.perform(get("/user/findById/{id}", userId)).andExpect(status().isNotFound());
        verify(userService).findById(userId);
    }

    //BaseRock generated method id: ${testThrowsNotTreatedException}, hash: 6C1838A5B3ACC5AB4C27DA5AA5F75D5E
    @Test
    void testThrowsNotTreatedException() throws Exception {
        mockMvc.perform(get("/user/throwsNotTreatedException")).andExpect(status().isInternalServerError());
    }

    //BaseRock generated method id: ${testFindAll}, hash: 7B97A723D56BC36F3F6D3DB936599D01
    @Test
    void testFindAll() throws Exception {
        //List<User> users = Arrays.asList(new User("1", "Alice"), new User("2", "Bob"));
        //when(userService.findAll()).thenReturn(users);
        //mockMvc.perform(get("/user/all")).andExpect(status().isOk()).andExpect(jsonPath("$[0].id").value("1")).andExpect(jsonPath("$[0].name").value("Alice")).andExpect(jsonPath("$[1].id").value("2")).andExpect(jsonPath("$[1].name").value("Bob"));
        //verify(userService).findAll();
    }

    //BaseRock generated method id: ${testFindAllIds}, hash: 44A149CC7FB89890C8F2780908AA8066
    @Test
    void testFindAllIds() throws Exception {
        List<String> ids = Arrays.asList("1", "2", "3");
        when(userService.findAllIds()).thenReturn(ids);
        mockMvc.perform(get("/user/allIds")).andExpect(status().isOk()).andExpect(jsonPath("$[0]").value("1")).andExpect(jsonPath("$[1]").value("2")).andExpect(jsonPath("$[2]").value("3"));
        verify(userService).findAllIds();
    }

    //BaseRock generated method id: ${testCreate}, hash: 48B5A26BC38B219545C8D18978EF3BA3
    @Test
    void testCreate() throws Exception {
        //User userToCreate = new User("789", "Eve");
        //mockMvc.perform(post("/user/create").contentType(MediaType.APPLICATION_JSON).content("{\"id\":\"789\",\"name\":\"Eve\"}")).andExpect(status().isOk());
        //verify(userService).create(any(User.class));
    }

    //BaseRock generated method id: ${testUpdate}, hash: FADF8CB5AB0DF6842F00C898BF8E481E
    @Test
    void testUpdate() throws Exception {
        //User userToUpdate = new User("456", "Updated User");
        //mockMvc.perform(post("/user/update").contentType(MediaType.APPLICATION_JSON).content("{\"id\":\"456\",\"name\":\"Updated User\"}")).andExpect(status().isOk());
        //verify(userService).update(any(User.class));
    }
}