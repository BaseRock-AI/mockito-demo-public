package demo.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class FooTest {

    @InjectMocks
    private Foo foo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testExampleWhenFirstTwoParametersAreEqualThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        // Assert
        verify(fooSpy, times(1)).example(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    }

    @Test
    void testExampleWhenThirdAndFourthParametersAreEqualThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    }

    @Test
    void testExampleWhenFifthAndSixthParametersAreEqualThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12);
    }

    @Test
    void testExampleWhenSeventhAndEighthParametersAreEqualThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11, 12);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11, 12);
    }

    @Test
    void testExampleWhenNinthAndTenthParametersAreEqualThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12);
    }

    @Test
    void testExampleWhenEleventhAndTwelfthParametersAreEqualThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12);
    }

    @Test
    void testExampleWhenThirteenthParameterIsEqualToOneThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1);
    }

    @Test
    void testExampleWhenThirteenthParameterIsEqualToTwoThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 2);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 2);
    }

    @Test
    void testExampleWhenThirteenthParameterIsEqualToThreeThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3);
    }

    @Test
    void testExampleWhenThirteenthParameterIsNotEqualToOneTwoOrThreeThenFiddleIsCalledOnce() {
        // Arrange
        Foo fooSpy = spy(foo);

        // Act
        fooSpy.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 4);

        // Assert
        verify(fooSpy, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 4);
    }
}
