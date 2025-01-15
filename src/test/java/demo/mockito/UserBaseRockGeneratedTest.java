package demo.mockito;

import demo.mockito.User;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import java.io.Serializable;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class UserBaseRockGeneratedTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("testId", "testHash", true);
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: E9D166584E7F9C54DAEBDD4B6A9EB2D0
    @Test
    void testDefaultConstructor() {
        User defaultUser = new User();
        assertNotNull(defaultUser);
        assertNull(defaultUser.getId());
        assertNull(defaultUser.getPasswordHash());
        assertFalse(defaultUser.isEnabled());
    }

    //BaseRock generated method id: ${testParameterizedConstructor}, hash: 66EA3120492FD20A808E6E3BFBC9AD11
    @Test
    void testParameterizedConstructor() {
        assertEquals("testId", user.getId());
        assertEquals("testHash", user.getPasswordHash());
        assertTrue(user.isEnabled());
    }

    //BaseRock generated method id: ${testCompareTo}, hash: 47B7A9E420A5DC28E313F6CA79A8BF56
    @Test
    void testCompareTo() {
        User user1 = new User("a", "hash", true);
        User user2 = new User("b", "hash", true);
        User user3 = new User("a", "hash", false);
        User userNull = new User(null, "hash", true);
        assertTrue(user1.compareTo(user2) < 0);
        assertEquals(0, user1.compareTo(user3));
        assertTrue(user2.compareTo(user1) > 0);
        assertEquals(0, userNull.compareTo(user1));
    }

    //BaseRock generated method id: ${testGettersAndSetters}, hash: D630A29F2B81716675562066564DD3A5
    @Test
    void testGettersAndSetters() {
        user.setId("newId");
        assertEquals("newId", user.getId());
        user.setPasswordHash("newHash");
        assertEquals("newHash", user.getPasswordHash());
        user.setEnabled(false);
        assertFalse(user.isEnabled());
    }

    //BaseRock generated method id: ${testGenerateRandomPassword}, hash: F3BA2D2C1E4FE3184ED7658BE3A07B86
    @Test
    void testGenerateRandomPassword() {
        assertEquals("ZZ", user.generateRandomPassword());
    }

    //BaseRock generated method id: ${testEquals}, hash: 92F696E49F147FEAE08D00C85F8293D5
    @Test
    void testEquals() {
        User sameUser = new User("testId", "testHash", true);
        User differentUser = new User("otherId", "otherHash", false);
        assertEquals(user, sameUser);
        assertNotEquals(user, differentUser);
        assertNotEquals(user, null);
        assertNotEquals(user, new Object());
    }

    //BaseRock generated method id: ${testHashCode}, hash: BCCB9EBE3BB4162CC4E723453523EDE7
    @Test
    void testHashCode() {
        User sameUser = new User("testId", "testHash", true);
        assertEquals(user.hashCode(), sameUser.hashCode());
        User differentUser = new User("otherId", "otherHash", false);
        assertNotEquals(user.hashCode(), differentUser.hashCode());
    }

    //BaseRock generated method id: ${testSerializable}, hash: 91F598F4A6B31440969AC684DA4C073C
    @Test
    void testSerializable() {
        assertTrue(user instanceof Serializable);
    }

    //BaseRock generated method id: ${testParameterizedUserCreation}, hash: CD7F8687D6F82D41833C3CD42DF8F2AD
    @ParameterizedTest
    @CsvSource({ "id1, hash1, true", "id2, hash2, false" })
    void testParameterizedUserCreation(String id, String hash, boolean enabled) {
        User paramUser = new User(id, hash, enabled);
        assertEquals(id, paramUser.getId());
        assertEquals(hash, paramUser.getPasswordHash());
        assertEquals(enabled, paramUser.isEnabled());
    }
}
