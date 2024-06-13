import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("The method can take 1 or 2 comma-separated numbers, and will return their sum.")
    void StringCalculatorAddWillReturnSumOfArgs() {
        Assertions.assertEquals(11+5+7, stringCalculator.add("11,5,7"));
        Assertions.assertEquals(0, stringCalculator.add(""));
    }
    @Test
    @DisplayName("The method returns 0 when passed the empty string.")
    void StringCalculatorAddWillReturn0ifArgIsEmpty() {
        Assertions.assertEquals(0, stringCalculator.add(""));
    }
}
