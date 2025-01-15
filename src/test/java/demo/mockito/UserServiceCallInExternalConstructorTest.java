package demo.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceCallInExternalConstructorTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceCallInExternalConstructor userServiceCallInExternalConstructor;

    private User expectedUser;

    @BeforeEach
    public void setUp() {
        expectedUser = new User("1", "hashedPassword", true);
        Mockito.when(userRepository.findById("1")).thenReturn(expectedUser);
        userServiceCallInExternalConstructor = new UserServiceCallInExternalConstructor(userRepository);
    }

    @Test
    public void testGetUserWhenUserExistsThenReturnUser() {
        // Act
        User actualUser = userServiceCallInExternalConstructor.getUser();

        // Assert
        assertEquals(expectedUser, actualUser);
    }
}
