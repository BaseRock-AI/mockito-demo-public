package demo.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UserServiceCallInAReturnOfCallInExternalConstructorTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceCallInAReturnOfCallInExternalConstructor userServiceCallInAReturnOfCallInExternalConstructor;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("1", "passwordHash", true);
        given(userRepository.findById("1")).willReturn(user);
        userServiceCallInAReturnOfCallInExternalConstructor = new UserServiceCallInAReturnOfCallInExternalConstructor(userRepository);
    }

    @Test
    public void testGetPasswordHash() {
        // Act
        String passwordHash = userServiceCallInAReturnOfCallInExternalConstructor.getPasswordHash();

        // Assert
        assertThat(passwordHash).isEqualTo("passwordHash");
    }

    @Test
    public void testReturnMyStringNull() {
        // Act
        String myStringNull = userServiceCallInAReturnOfCallInExternalConstructor.returnMyStringNull();

        // Assert
        assertThat(myStringNull).isNull();
    }
}