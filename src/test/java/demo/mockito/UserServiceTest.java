package demo.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    @Test
    public void testIsValidUserWhenUserIdIsNullThenThrowIllegalArgumentException() {
        // Arrange
        String userId = null;
        String password = "password";

        // Act & Assert
        Assertions.assertThatThrownBy(() -> userService.isValidUser(userId, password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid UserId");
    }

    @Test
    public void testIsValidUserWhenUserNotFoundThenReturnFalse() {
        // Arrange
        String userId = "user1";
        String password = "password";
        given(userRepository.findById(userId)).willReturn(null);

        // Act
        boolean result = userService.isValidUser(userId, password);

        // Assert
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void testIsValidUserWhenUserIsDisabledThenReturnFalse() {
        // Arrange
        String userId = "user1";
        String password = "password";
        User user = new User(userId, "encodedPassword", false);
        given(userRepository.findById(userId)).willReturn(user);

        // Act
        boolean result = userService.isValidUser(userId, password);

        // Assert
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void testIsValidUserWhenPasswordIsIncorrectThenReturnFalse() {
        // Arrange
        String userId = "user1";
        String password = "password";
        User user = new User(userId, "encodedPassword", true);
        given(userRepository.findById(userId)).willReturn(user);
        given(passwordEncoder.encode(password)).willReturn("wrongEncodedPassword");

        // Act
        boolean result = userService.isValidUser(userId, password);

        // Assert
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void testIsValidUserWhenUserIsValidThenReturnTrue() {
        // Arrange
        String userId = "user1";
        String password = "password";
        User user = new User(userId, "encodedPassword", true);
        given(userRepository.findById(userId)).willReturn(user);
        given(passwordEncoder.encode(password)).willReturn("encodedPassword");

        // Act
        boolean result = userService.isValidUser(userId, password);

        // Assert
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void testFindById() {
        // Arrange
        String userId = "user1";
        User user = new User(userId, "passwordHash", true);
        given(userRepository.findById(userId)).willReturn(user);

        // Act
        User result = userService.findById(userId);

        // Assert
        Assertions.assertThat(result).isEqualTo(user);
    }

    @Test
    public void testFindByIds() {
        // Arrange
        List<String> userIds = Arrays.asList("user1", "user2");
        User user1 = new User("user1", "passwordHash1", true);
        User user2 = new User("user2", "passwordHash2", true);
        given(userRepository.findById("user1")).willReturn(user1);
        given(userRepository.findById("user2")).willReturn(user2);

        // Act
        List<User> result = userService.findByIds(userIds);

        // Assert
        Assertions.assertThat(result).containsExactly(user1, user2);
    }

    @Test
    public void testCreate() {
        // Arrange
        User user = new User("user1", "passwordHash", true);

        // Act
        userService.create(user);

        // Assert
        verify(userRepository, times(1)).create(user);
    }

    @Test
    public void testUpdate() {
        // Arrange
        User user = new User("user1", "passwordHash", true);

        // Act
        userService.update(user);

        // Assert
        verify(userRepository, times(1)).update(user);
    }

    @Test
    public void testGreet() {
        // Act
        String result = userService.greet();

        // Assert
        Assertions.assertThat(result).isEqualTo("Hello, I'm UserService");
    }

    @Test
    public void testFindAll() {
        // Arrange
        User user1 = new User("user1", "passwordHash1", true);
        User user2 = new User("user2", "passwordHash2", true);
        List<User> users = Arrays.asList(user1, user2);
        given(userRepository.findAll()).willReturn(users);

        // Act
        List<User> result = userService.findAll();

        // Assert
        Assertions.assertThat(result).isEqualTo(users);
    }

    @Test
    public void testFindAllIds() {
        // Arrange
        User user1 = new User("user1", "passwordHash1", true);
        User user2 = new User("user2", "passwordHash2", true);
        List<User> users = Arrays.asList(user1, user2);
        given(userRepository.findAll()).willReturn(users);

        // Act
        List<String> result = userService.findAllIds();

        // Assert
        Assertions.assertThat(result).containsExactly("user1", "user2");
    }
}
