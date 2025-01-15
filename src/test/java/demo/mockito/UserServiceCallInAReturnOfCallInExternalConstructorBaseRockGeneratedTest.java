package demo.mockito;

import demo.mockito.UserServiceCallInAReturnOfCallInExternalConstructor;

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

class UserServiceCallInAReturnOfCallInExternalConstructorBaseRockGeneratedTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserServiceDependency2 userServiceDependency2;

    private UserServiceCallInAReturnOfCallInExternalConstructor userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserServiceCallInAReturnOfCallInExternalConstructor(userRepository);
    }

    //BaseRock generated method id: ${testGetPasswordHash}, hash: F221043E1C7204D58C8646E655C662AA
    @Test
    void testGetPasswordHash() {
        String expectedHash = "hashedPassword";
        when(userServiceDependency2.getPasswordHash()).thenReturn(expectedHash);
        // Use reflection to set the mocked dependency
        try {
            java.lang.reflect.Field dependencyField = UserServiceCallInAReturnOfCallInExternalConstructor.class.getDeclaredField("dependency");
            dependencyField.setAccessible(true);
            dependencyField.set(userService, userServiceDependency2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail("Failed to set mocked dependency: " + e.getMessage());
        }
        String result = userService.getPasswordHash();
        assertEquals(expectedHash, result);
        verify(userServiceDependency2).getPasswordHash();
    }

    //BaseRock generated method id: ${testReturnMyStringNull}, hash: 1EC952DB51DD2CFC1FBB981E13CA3A87
    @Test
    void testReturnMyStringNull() {
        String result = userService.returnMyStringNull();
        assertNull(result);
    }

    //BaseRock generated method id: ${testConstructorWithNullUserRepository}, hash: 7D46171C8A885F64B9B56D3D7535E21F
    @Test
    void testConstructorWithNullUserRepository() {
        assertThrows(NullPointerException.class, () -> new UserServiceCallInAReturnOfCallInExternalConstructor(null));
    }
}
