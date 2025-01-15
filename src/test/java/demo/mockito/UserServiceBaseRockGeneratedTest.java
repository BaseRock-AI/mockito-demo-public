package demo.mockito;

import demo.mockito.UserService;

import java.util.Arrays;
import org.mockito.MockitoAnnotations;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class UserServiceBaseRockGeneratedTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository, passwordEncoder);
    }

    //BaseRock generated method id: ${testIsValidUserWithValidCredentials}, hash: 630559E218D193C40DA7354E11900308
    @Test
    void testIsValidUserWithValidCredentials() {
        User user = new User();
        user.setEnabled(true);
        user.setPasswordHash("encodedPassword");
        when(userRepository.findById("validUserId")).thenReturn(user);
        when(passwordEncoder.encode("password")).thenReturn("encodedPassword");
        assertTrue(userService.isValidUser("validUserId", "password"));
    }

    //BaseRock generated method id: ${testIsValidUserWithInvalidUserId}, hash: 5718C559807A801FE178B5B0342A013A
    @Test
    void testIsValidUserWithInvalidUserId() {
        when(userRepository.findById("invalidUserId")).thenReturn(null);
        assertFalse(userService.isValidUser("invalidUserId", "password"));
    }

    //BaseRock generated method id: ${testIsValidUserWithDisabledUser}, hash: 3DD564D28358FC06554D40F6C8472049
    @Test
    void testIsValidUserWithDisabledUser() {
        User user = new User();
        user.setEnabled(false);
        when(userRepository.findById("disabledUserId")).thenReturn(user);
        assertFalse(userService.isValidUser("disabledUserId", "password"));
    }

    //BaseRock generated method id: ${testIsValidUserWithInvalidPassword}, hash: 4FB65B6948D11CA09283469BE275E1E2
    @Test
    void testIsValidUserWithInvalidPassword() {
        User user = new User();
        user.setEnabled(true);
        user.setPasswordHash("correctEncodedPassword");
        when(userRepository.findById("userId")).thenReturn(user);
        when(passwordEncoder.encode("wrongPassword")).thenReturn("wrongEncodedPassword");
        assertFalse(userService.isValidUser("userId", "wrongPassword"));
    }

    //BaseRock generated method id: ${testIsValidUserWithNullUserId}, hash: 73E0BAD563D12DE933269CD335526315
    @Test
    void testIsValidUserWithNullUserId() {
        assertThrows(IllegalArgumentException.class, () -> userService.isValidUser(null, "password"));
    }

    //BaseRock generated method id: ${testFindById}, hash: 3274ECB545FE161C0CBAB79082F2F89B
    @Test
    void testFindById() {
        User user = new User();
        when(userRepository.findById("userId")).thenReturn(user);
        assertEquals(user, userService.findById("userId"));
    }

    //BaseRock generated method id: ${testFindByIds}, hash: C8545AA360BDE4EDB21A2F2F6A6F50BE
    @Test
    void testFindByIds() {
        User user1 = new User();
        User user2 = new User();
        when(userRepository.findById("id1")).thenReturn(user1);
        when(userRepository.findById("id2")).thenReturn(user2);
        List<User> result = userService.findByIds(Arrays.asList("id1", "id2"));
        assertEquals(2, result.size());
        assertEquals(user1, result.get(0));
        assertEquals(user2, result.get(1));
    }

    //BaseRock generated method id: ${testCreate}, hash: D427F9963A919EC98B057C3C16309FB1
    @Test
    void testCreate() {
        User user = new User();
        userService.create(user);
        verify(userRepository).create(user);
    }

    //BaseRock generated method id: ${testUpdate}, hash: 698751A466A4368BB438208ABAC6D667
    @Test
    void testUpdate() {
        User user = new User();
        userService.update(user);
        verify(userRepository).update(user);
    }

    //BaseRock generated method id: ${testGreet}, hash: D69822B8D050DC0E1AA89EE3B08CC0D9
    @Test
    void testGreet() {
        assertEquals("Hello, I'm UserService", userService.greet());
    }

    //BaseRock generated method id: ${testFindAll}, hash: 66BAB0A3DCF581E8C39334BE57C253A8
    @Test
    void testFindAll() {
        List<User> users = Arrays.asList(new User(), new User());
        when(userRepository.findAll()).thenReturn(users);
        assertEquals(users, userService.findAll());
    }

    //BaseRock generated method id: ${testFindAllIds}, hash: 5873B494F13AAC4080E21C93D1DDA272
    @Test
    void testFindAllIds() {
        User user1 = new User();
        user1.setId("id1");
        User user2 = new User();
        user2.setId("id2");
        when(userRepository.findAll()).thenReturn(Arrays.asList(user1, user2));
        List<String> result = userService.findAllIds();
        assertEquals(Arrays.asList("id1", "id2"), result);
    }

    //BaseRock generated method id: ${testFindAllIdsWithEmptyList}, hash: BD5F0234510AD31E077F6AF5854E2B9B
    @Test
    void testFindAllIdsWithEmptyList() {
        when(userRepository.findAll()).thenReturn(Collections.emptyList());
        List<String> result = userService.findAllIds();
        assertTrue(result.isEmpty());
    }

    //BaseRock generated method id: ${testIsValidUserParameterized}, hash: ABB8BFEE00AE4C3DECBCE9641C4D82AB
    @ParameterizedTest
    @CsvSource({ "true, encodedPassword, encodedPassword, true", "true, encodedPassword, wrongPassword, false", "false, encodedPassword, encodedPassword, false" })
    void testIsValidUserParameterized(boolean isEnabled, String storedPassword, String inputPassword, boolean expected) {
        User user = new User();
        user.setEnabled(isEnabled);
        user.setPasswordHash(storedPassword);
        when(userRepository.findById("userId")).thenReturn(user);
        when(passwordEncoder.encode(inputPassword)).thenReturn(inputPassword);
        assertEquals(expected, userService.isValidUser("userId", inputPassword));
    }
}
