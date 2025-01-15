package demo.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticAddTest {

    private ArithmeticAdd arithmeticAdd;

    @BeforeEach
    public void setUp() {
        arithmeticAdd = new ArithmeticAdd();
    }

    @Test
    public void testAdd2WhenPositiveNumberThenReturnSum() {
        // Arrange
        float input = 5.0f;
        float expected = 7.0f;

        // Act
        float result = arithmeticAdd.add2(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd2WhenNegativeNumberThenReturnSum() {
        // Arrange
        float input = -3.0f;
        float expected = -1.0f;

        // Act
        float result = arithmeticAdd.add2(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd2WhenZeroThenReturnSum() {
        // Arrange
        float input = 0.0f;
        float expected = 2.0f;

        // Act
        float result = arithmeticAdd.add2(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3WhenPositiveNumberThenReturnSum() {
        // Arrange
        float input = 5.0f;
        float expected = 12.0f;

        // Act
        float result = arithmeticAdd.add3(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3WhenNegativeNumberThenReturnSum() {
        // Arrange
        float input = -3.0f;
        float expected = 4.0f;

        // Act
        float result = arithmeticAdd.add3(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3WhenZeroThenReturnSum() {
        // Arrange
        float input = 0.0f;
        float expected = 7.0f;

        // Act
        float result = arithmeticAdd.add3(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3dfsWhenPositiveNumberThenReturnSum() {
        // Arrange
        float input = 5.0f;
        float expected = 12.0f;

        // Act
        float result = arithmeticAdd.add3dfs(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3dfsWhenNegativeNumberThenReturnSum() {
        // Arrange
        float input = -3.0f;
        float expected = 4.0f;

        // Act
        float result = arithmeticAdd.add3dfs(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3dfsWhenZeroThenReturnSum() {
        // Arrange
        float input = 0.0f;
        float expected = 7.0f;

        // Act
        float result = arithmeticAdd.add3dfs(input);

        // Assert
        assertEquals(expected, result);
    }
}
