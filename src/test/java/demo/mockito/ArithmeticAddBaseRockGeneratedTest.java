package demo.mockito;

import demo.mockito.ArithmeticAdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class ArithmeticAddBaseRockGeneratedTest {

    private ArithmeticAdd arithmeticAdd;

    @BeforeEach
    void setUp() {
        arithmeticAdd = new ArithmeticAdd();
    }

    //BaseRock generated method id: ${add2_shouldAddTwoToInput}, hash: 6BF782C8A0AD3840AAE314DCDCF65CED
    @ParameterizedTest
    @CsvSource({ "0, 2", "-2, 0", "2, 4", "3.5, 5.5", "-3.5, -1.5" })
    void add2_shouldAddTwoToInput(float input, float expected) {
        assertEquals(expected, arithmeticAdd.add2(input), 0.0001f, "add2 should add 2 to the input");
    }

    //BaseRock generated method id: ${add2_withMaxFloatValue_shouldReturnCorrectResult}, hash: 07197D3E7EAF757F6BB094DEDB90D555
    @Test
    void add2_withMaxFloatValue_shouldReturnCorrectResult() {
        float maxFloat = Float.MAX_VALUE;
        assertEquals(maxFloat, arithmeticAdd.add2(maxFloat), 0.0001f, "add2 should handle max float value correctly");
    }

    //BaseRock generated method id: ${add2_withMinFloatValue_shouldReturnCorrectResult}, hash: 02B8BE87A0BA27701BC75CA6DD33F68F
    @Test
    void add2_withMinFloatValue_shouldReturnCorrectResult() {
        float minFloat = Float.MIN_VALUE;
        assertEquals(minFloat + 2, arithmeticAdd.add2(minFloat), 0.0001f, "add2 should handle min float value correctly");
    }

    //BaseRock generated method id: ${add3_shouldAddSevenToInput}, hash: CBEC878F7EAD20C2317C01AE58DAFEAC
    @ParameterizedTest
    @CsvSource({ "0, 7", "-7, 0", "3, 10", "3.5, 10.5", "-3.5, 3.5" })
    void add3_shouldAddSevenToInput(float input, float expected) {
        assertEquals(expected, arithmeticAdd.add3(input), 0.0001f, "add3 should add 7 to the input");
    }

    //BaseRock generated method id: ${add3_withMaxFloatValue_shouldReturnCorrectResult}, hash: AFDCF398BF3D4A46288DF05EDAC2F549
    @Test
    void add3_withMaxFloatValue_shouldReturnCorrectResult() {
        float maxFloat = Float.MAX_VALUE;
        assertEquals(maxFloat, arithmeticAdd.add3(maxFloat), 0.0001f, "add3 should handle max float value correctly");
    }

    //BaseRock generated method id: ${add3_withMinFloatValue_shouldReturnCorrectResult}, hash: 6EDB6DB4E8FD9321E34B4C25A85A0F77
    @Test
    void add3_withMinFloatValue_shouldReturnCorrectResult() {
        float minFloat = Float.MIN_VALUE;
        assertEquals(minFloat + 7, arithmeticAdd.add3(minFloat), 0.0001f, "add3 should handle min float value correctly");
    }

    //BaseRock generated method id: ${add3dfs_shouldAddSevenToInput}, hash: 27EEC268790F4722179078BC37335780
    @ParameterizedTest
    @CsvSource({ "0, 7", "-7, 0", "3, 10", "3.5, 10.5", "-3.5, 3.5" })
    void add3dfs_shouldAddSevenToInput(float input, float expected) {
        assertEquals(expected, arithmeticAdd.add3dfs(input), 0.0001f, "add3dfs should add 7 to the input");
    }

    //BaseRock generated method id: ${add3dfs_withMaxFloatValue_shouldReturnCorrectResult}, hash: 519ABC1D43542F7156FE3EE23B22343D
    @Test
    void add3dfs_withMaxFloatValue_shouldReturnCorrectResult() {
        float maxFloat = Float.MAX_VALUE;
        assertEquals(maxFloat, arithmeticAdd.add3dfs(maxFloat), 0.0001f, "add3dfs should handle max float value correctly");
    }

    //BaseRock generated method id: ${add3dfs_withMinFloatValue_shouldReturnCorrectResult}, hash: A3EECC1FC57023C73D10D9EAC882A20B
    @Test
    void add3dfs_withMinFloatValue_shouldReturnCorrectResult() {
        float minFloat = Float.MIN_VALUE;
        assertEquals(minFloat + 7, arithmeticAdd.add3dfs(minFloat), 0.0001f, "add3dfs should handle min float value correctly");
    }
}
