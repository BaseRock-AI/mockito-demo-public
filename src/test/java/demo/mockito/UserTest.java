/*
package demo.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Method;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTest {

    @Test
    @Order(1)
    public void testCompareToWhenIdsAreDifferentThenReturnCorrectComparison() {
        // Arrange
        User user1 = new User("abc", "hash1", true);
        User user2 = new User("xyz", "hash2", false);

        // Act
        int result = user1.compareTo(user2);

        // Assert
        Assertions.assertTrue(result < 0);
    }

    @Test
    @Order(2)
    public void testCompareToWhenIdsAreSameThenReturnZero() {
        // Arrange
        User user1 = new User("abc", "hash1", true);
        User user2 = new User("abc", "hash2", false);

        // Act
        int result = user1.compareTo(user2);

        // Assert
        Assertions.assertEquals(0, result);
    }

    @Test
    @Order(3)
    public void testCompareToWhenIdIsNullThenReturnZero() {
        // Arrange
        User user1 = new User(null, "hash1", true);
        User user2 = new User("xyz", "hash2", false);

        // Act
        int result = user1.compareTo(user2);

        // Assert
        Assertions.assertEquals(0, result);
    }

    @Test
    @Order(4)
    public void testGetIdWhenIdIsSetThenReturnId() {
        // Arrange
        User user = new User("abc", "hash1", true);

        // Act
        String id = user.getId();

        // Assert
        Assertions.assertEquals("abc", id);
    }

    @Test
    @Order(5)
    public void testSetIdWhenIdIsSetThenGetIdReturnsId() {
        // Arrange
        User user = new User();
        user.setId("abc");

        // Act
        String id = user.getId();

        // Assert
        Assertions.assertEquals("abc", id);
    }

    @Test
    @Order(6)
    public void testGetPasswordHashWhenPasswordHashIsSetThenReturnPasswordHash() {
        // Arrange
        User user = new User("abc", "hash1", true);

        // Act
        String passwordHash = user.getPasswordHash();

        // Assert
        Assertions.assertEquals("hash1", passwordHash);
    }

    @Test
    @Order(7)
    public void testSetPasswordHashWhenPasswordHashIsSetThenGetPasswordHashReturnsPasswordHash() {
        // Arrange
        User user = new User();
        user.setPasswordHash("hash1");

        // Act
        String passwordHash = user.getPasswordHash();

        // Assert
        Assertions.assertEquals("hash1", passwordHash);
    }

    @Test
    @Order(8)
    public void testIsEnabledWhenEnabledIsSetThenReturnEnabled() {
        // Arrange
        User user = new User("abc", "hash1", true);

        // Act
        boolean enabled = user.isEnabled();

        // Assert
        Assertions.assertTrue(enabled);
    }

    @Test
    @Order(9)
    public void testSetEnabledWhenEnabledIsSetThenIsEnabledReturnsEnabled() {
        // Arrange
        User user = new User();
        user.setEnabled(true);

        // Act
        boolean enabled = user.isEnabled();

        // Assert
        Assertions.assertTrue(enabled);
    }

    @Test
    @Order(10)
    public void testGenerateRandomPasswordWhenCalledThenReturnZZ() {
        // Arrange
        User user = new User();

        // Act
        String randomPassword = user.generateRandomPassword();

        // Assert
        Assertions.assertEquals("ZZ", randomPassword);
    }

    @Test
    @Order(11)
    public void testConcatIdAndPasswordWhenCalledThenReturnConcatenation() throws Exception {
        // Arrange
        User user = new User("abc", "hash1", true);
        Method method = User.class.getDeclaredMethod("concatIdAndPassword");
        method.setAccessible(true);

        // Act
        String result = (String) method.invoke(user);

        // Assert
        Assertions.assertEquals("abchash1", result);
    }

    @Test
    @Order(12)
    public void testEqualsWhenUsersAreSameThenReturnTrue() {
        // Arrange
        User user1 = new User("abc", "hash1", true);
        User user2 = new User("abc", "hash1", true);

        // Act
        boolean result = user1.equals(user2);

        // Assert
        Assertions.assertTrue(result);
    }

    @Test
    @Order(13)
    public void testEqualsWhenUsersAreDifferentThenReturnFalse() {
        // Arrange
        User user1 = new User("abc", "hash1", true);
        User user2 = new User("xyz", "hash2", false);

        // Act
        boolean result = user1.equals(user2);

        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    @Order(14)
    public void testHashCodeWhenCalledThenReturnHashCode() {
        // Arrange
        User user = new User("abc", "hash1", true);

        // Act
        int hashCode = user.hashCode();

        // Assert
        Assertions.assertEquals(Objects.hash("abc", "hash1", true), hashCode);
    }
}
*/
