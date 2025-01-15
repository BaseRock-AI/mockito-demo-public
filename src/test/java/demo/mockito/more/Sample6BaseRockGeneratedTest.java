package demo.mockito.more;

import demo.mockito.more.Sample6;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import org.junit.jupiter.params.ParameterizedTest;
import java.text.ParseException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.DateFormat;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class Sample6BaseRockGeneratedTest {

    private Sample6 sample6;

    @Mock
    private Queue<String> mockQueue;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        sample6 = new Sample6();
    }

    //BaseRock generated method id: ${testAddElements}, hash: 3DCA9DD4FC51905E00708B731503B516
    @Test
    void testAddElements() {
        Queue<String> result = sample6.addElements(mockQueue);
        verify(mockQueue).add("aaaa");
        verify(mockQueue).add("bbbb");
        assertEquals(mockQueue, result);
    }

    //BaseRock generated method id: ${testFormat}, hash: 7C3A7EC6BE75BA66D9F6DC305A057665
    @ParameterizedTest
    @CsvSource({ "01/01/2023", "12/31/2023", "02/29/2024" })
    void testFormat(String dateString) throws ParseException {
        Date result = sample6.format(dateString);
        assertNotNull(result);
    }

    //BaseRock generated method id: ${testFormatInvalidDate}, hash: 121FDCF16062CBCAD212B155A5843AF7
    @Test
    void testFormatInvalidDate() {
        assertThrows(ParseException.class, () -> sample6.format("invalid-date"));
    }

    //BaseRock generated method id: ${testAddElemdasents}, hash: FF910D5E02B3BDDA2986945D9B275996
    @Test
    void testAddElemdasents() {
        Queue<String> result = sample6.addElemdasents(mockQueue);
        verify(mockQueue).add("aaaa");
        verify(mockQueue).add("bbbb");
        assertEquals(mockQueue, result);
    }

    //BaseRock generated method id: ${testAddElementsWithRealQueue}, hash: D71862D976D43B89E786BDA23D0E1F87
    @Test
    void testAddElementsWithRealQueue() {
        Queue<String> realQueue = new LinkedList<>();
        Queue<String> result = sample6.addElements(realQueue);
        assertEquals(2, result.size());
        assertTrue(result.contains("aaaa"));
        assertTrue(result.contains("bbbb"));
    }

    //BaseRock generated method id: ${testAddElemdasentsWithRealQueue}, hash: 2CE1E4CDC7CD177E3CC4DC7D4D0DDF2C
    @Test
    void testAddElemdasentsWithRealQueue() {
        Queue<String> realQueue = new LinkedList<>();
        Queue<String> result = sample6.addElemdasents(realQueue);
        assertEquals(2, result.size());
        assertTrue(result.contains("aaaa"));
        assertTrue(result.contains("bbbb"));
    }
}
