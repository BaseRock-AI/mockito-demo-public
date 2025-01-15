package demo.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceDependencyTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceDependency userServiceDependency;

    private User expectedUser;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        expectedUser = new User("1", "hashedPassword", true);
        when(userRepository.findById("1")).thenReturn(expectedUser);
    }

    @Test
    public void testGetUserWhenCalledThenReturnExpectedUser() {
        // Act
        User actualUser = userServiceDependency.getUser();

        // Assert
        assertEquals(expectedUser, actualUser);
    }
}
