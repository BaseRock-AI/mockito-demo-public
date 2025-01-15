package demo.mockito;

import demo.mockito.UserServiceCallInExternalConstructor;

import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class UserServiceCallInExternalConstructorBaseRockGeneratedTest {

    @Mock
    private UserRepository userRepository;

    private UserServiceCallInExternalConstructor userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserServiceCallInExternalConstructor(userRepository);
    }

    //BaseRock generated method id: ${testGetUser_UserExists}, hash: 76B20D26EDB1393B0EFD37504253C307
    @Test
    void testGetUser_UserExists() {
        // Arrange
        User expectedUser = new User();
        when(userRepository.findById(any())).thenReturn(expectedUser);
        // Act
        User result = userService.getUser();
        // Assert
        assertEquals(expectedUser, result);
        verify(userRepository, times(1)).findById(any());
    }

    //BaseRock generated method id: ${testGetUser_UserNotFound}, hash: 909C1BD60B9BEBF410ACB2BF96316C54
    @Test
    void testGetUser_UserNotFound() {
        // Arrange
        when(userRepository.findById(any())).thenThrow(new UserNotFoundException());
        // Act & Assert
        assertThrows(UserNotFoundException.class, () -> new UserServiceCallInExternalConstructor(userRepository));
    }

    //BaseRock generated method id: ${testConstructor_NullUserRepository}, hash: 9A89A4BDB8EFB4053152E6F451A68793
    @Test
    void testConstructor_NullUserRepository() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> new UserServiceCallInExternalConstructor(null));
    }
}
