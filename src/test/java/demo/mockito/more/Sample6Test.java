/*
package demo.mockito.more;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.text.ParseException;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class Sample6Test {

    @InjectMocks
    private Sample6 sample6;

    @Mock
    private Queue<String> mockQueue;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddElementsWhenQueueIsPassedThenTwoElementsAreAdded() {
        // Arrange
        // Act
        sample6.addElements(mockQueue);

        // Assert
        verify(mockQueue, times(1)).add("aaaa");
        verify(mockQueue, times(1)).add("bbbb");
    }

    @Test
    public void testFormatWhenValidDateStringIsPassedThenDateObjectIsReturned() throws ParseException {
        // Arrange
        String validDateString = "12/31/2023";

        // Act
        Date result = sample6.format(validDateString);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void testFormatWhenInvalidDateStringIsPassedThenParseExceptionIsThrown() {
        // Arrange
        String invalidDateString = "invalid-date";

        // Act & Assert
        assertThrows(ParseException.class, () -> sample6.format(invalidDateString));
    }

    @Test
    public void testAddElemdasentsWhenQueueIsPassedThenTwoElementsAreAdded() {
        // Arrange
        // Act
        sample6.addElemdasents(mockQueue);

        // Assert
        verify(mockQueue, times(1)).add("aaaa");
        verify(mockQueue, times(1)).add("bbbb");
    }
}
*/
