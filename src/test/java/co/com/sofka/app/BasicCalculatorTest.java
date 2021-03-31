package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();


    //----------------------Test Sum ----------------------
    @Test
    @DisplayName("Testing suma 1+1=2")
    void sum() {

        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        //Act
        Long result = basicCalculator.sum(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }

    //----------------------Test several sums----------------------

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    //----------------------Test de la resta simple----------------------
    @Test
    @DisplayName("Testing subtraction 3-2=1")
    public void subtraction() {
        Long number1 = 3L, number2 = 2L, expectedValue = 1L;
        Long result = basicCalculator.subtraction(number1, number2);
        assertEquals(expectedValue, result);

    }

    //----------------------Test de la resta, several values----------------------
    @DisplayName("Testing subtraction with several values")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "10,    5,   5",
            "100,  51, 49",
            "10,  9, 1"
    })
    public void severalSubs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtraction(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    //----------------------Test simple multiply----------------------
    @Test
    @DisplayName("Test multiply 3 * 2 = 6")
    public void multiply(){
        Long number1 = 3L, number2 = 2L, expectedValue = 6L;
        Long result = basicCalculator.multiply(number1, number2);
        assertEquals(expectedValue, result);
    }

    //----------------------Test several multiplies----------------------
    @DisplayName("Testing several multiplies")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "10,    5,   50",
            "100,  50, 5000",
            "4,  5, 20"
    })
    public void severalMultiplies(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    //----------------------Test simple divide ----------------------
    @Test
    @DisplayName("Test simple divide 4/2 = 2")
    public void divide(){
        Long number1 = 4L, number2 = 2L, expectedValue = 2L;
        Long result = basicCalculator.divide(number1, number2);
        assertEquals(expectedValue, result);
    }

    //----------------------Test simple divide ----------------------
    @DisplayName("Testing several multiplies")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    100,   0",
            "4,    0,   0",
            "6,  3, 2",
            "40,  5, 8"
    })
    public void severalDivides(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}