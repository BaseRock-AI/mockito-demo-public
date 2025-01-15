package Demo.mockito;

import demo.mockito.Foo;

import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Spy;
import static org.mockito.ArgumentMatchers.anyInt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class FooBaseRockGeneratedTest {

    @Spy
    private Foo foo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testExample}, hash: 9721B929D634DD4626EA3B51AFC87EE6
    @ParameterizedTest
    @CsvSource({ "1, 1, 2, 2, 3, 4, 5, 5, 7, 8, 0, 3, 1", "1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 0, 3, 1", "1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 0, 3, 1", "1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 0, 0, 1", "1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 0, 3, 2", "1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 0, 3, 3", "1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 0, 3, 4" })
    void testExample(int a, int b, int a1, int b1, int c, int d, int a2, int b2, int e, int f, int n, int h, int z) {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(a, b, a1, b1, c, d, a2, b2, e, f, n, h, z);
        verify(foo, times(1)).example(a, b, a1, b1, c, d, a2, b2, e, f, n, h, z);
    }

    //BaseRock generated method id: ${testExampleWithInfiniteLoop}, hash: D7C361CB8AB8017ACA3A40E760634B91
    @Test
    void testExampleWithInfiniteLoop() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            foo.example(1, 2, 3, 4, 0, 0, 5, 6, 7, 8, 0, 3, 1);
        });
        verify(foo, times(1)).example(1, 2, 3, 4, 0, 0, 5, 6, 7, 8, 0, 3, 1);
    }

    //BaseRock generated method id: ${testExampleWithEqualAAndB}, hash: 8680CC9F516A110026D3138B33AC4D76
    @Test
    void testExampleWithEqualAAndB() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 1);
        verify(foo, times(1)).example(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 1);
    }

    //BaseRock generated method id: ${testExampleWithEqualCAndD}, hash: B9DDA469C0DC091A2543814184C7EA11
    @Test
    void testExampleWithEqualCAndD() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 0, 1, 1);
        verify(foo, times(1)).example(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 0, 1, 1);
    }

    //BaseRock generated method id: ${testExampleWithEqualEAndF}, hash: B318B088C89BE5CECB24D5F1DCA45414
    @Test
    void testExampleWithEqualEAndF() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0, 1, 1);
        verify(foo, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0, 1, 1);
    }

    //BaseRock generated method id: ${testExampleWithSwitchCase1}, hash: FB53AE53EC2297E11D26F756C88F7B83
    @Test
    void testExampleWithSwitchCase1() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 1);
        verify(foo, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 1);
    }

    //BaseRock generated method id: ${testExampleWithSwitchCase2}, hash: A289E3E25D2CD67A2139F3085820026B
    @Test
    void testExampleWithSwitchCase2() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2);
        verify(foo, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2);
    }

    //BaseRock generated method id: ${testExampleWithSwitchCase3}, hash: E2228071775F1CF981D4662F5FE64A00
    @Test
    void testExampleWithSwitchCase3() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 3);
        verify(foo, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 3);
    }

    //BaseRock generated method id: ${testExampleWithSwitchDefaultCase}, hash: 17C302595CF80B95FFC9E673F9AFD9A0
    @Test
    void testExampleWithSwitchDefaultCase() {
        doNothing().when(foo).example(anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt());
        foo.example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 4);
        verify(foo, times(1)).example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 4);
    }
}
