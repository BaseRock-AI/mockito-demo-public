package demo.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceDependency2Test {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceDependency2 userServiceDependency2;

    private User expectedUser;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        expectedUser = new User("1", "hashedPassword", true);
        when(userRepository.findById("1")).thenReturn(expectedUser);
        userServiceDependency2 = new UserServiceDependency2(userRepository);
    }

    @Test
    public void testGetPasswordHashWhenCalledThenReturnExpectedPasswordHash() {
        // Act
        String actualPasswordHash = userServiceDependency2.getPasswordHash();

        // Assert
        assertEquals(expectedUser.getPasswordHash(), actualPasswordHash);
    }
}