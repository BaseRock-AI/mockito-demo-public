package demo.mockito;

import demo.mockito.UserServiceDependency2;

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

class UserServiceDependency2BaseRockGeneratedTest {

    @Mock
    private UserRepository userRepository;

    private UserServiceDependency2 userServiceDependency2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        User user = new User();
        user.setPasswordHash("hashedPassword");
        when(userRepository.findById("1")).thenReturn(user);
        userServiceDependency2 = new UserServiceDependency2(userRepository);
    }

    //BaseRock generated method id: ${testConstructor_UserFound}, hash: 12FBE5248A68DE4DD57DCE07FA208F87
    @Test
    void testConstructor_UserFound() {
        assertEquals("hashedPassword", userServiceDependency2.getPasswordHash());
        verify(userRepository).findById("1");
    }

    //BaseRock generated method id: ${testConstructor_UserNotFound}, hash: 48000DF33D39DA603BBA4F64FE72726A
    @Test
    void testConstructor_UserNotFound() {
        when(userRepository.findById("1")).thenThrow(new UserNotFoundException());
        assertThrows(UserNotFoundException.class, () -> new UserServiceDependency2(userRepository));
        verify(userRepository).findById("1");
    }

    //BaseRock generated method id: ${testGetPasswordHash}, hash: DBBC42B80EC3B6C495FED60177ED7CA1
    @Test
    void testGetPasswordHash() {
        assertEquals("hashedPassword", userServiceDependency2.getPasswordHash());
    }
}
