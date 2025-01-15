package demo.mockito;

import demo.mockito.UserServiceDependency;

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

class UserServiceDependencyBaseRockGeneratedTest {

    @Mock
    private UserRepository userRepository;

    private UserServiceDependency userServiceDependency;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        User mockUser = new User();
        when(userRepository.findById("1")).thenReturn(mockUser);
        userServiceDependency = new UserServiceDependency(userRepository);
    }

    //BaseRock generated method id: ${testConstructorInitializesUserCorrectly}, hash: BF3A7C663533E4EE0BD26CD3B79DCD6D
    @Test
    void testConstructorInitializesUserCorrectly() {
        assertNotNull(userServiceDependency.getUser());
        verify(userRepository).findById("1");
    }

    //BaseRock generated method id: ${testGetUser}, hash: A36DD81982C60CFE2DA298ADEE785881
    @Test
    void testGetUser() {
        User user = userServiceDependency.getUser();
        assertNotNull(user);
        assertEquals(user, userServiceDependency.getUser());
    }

    //BaseRock generated method id: ${testConstructorThrowsUserNotFoundException}, hash: C4A7B953B9A99CE702A06076495E1EAB
    @Test
    void testConstructorThrowsUserNotFoundException() {
        when(userRepository.findById("1")).thenThrow(new UserNotFoundException());
        assertThrows(UserNotFoundException.class, () -> new UserServiceDependency(userRepository));
    }
}
