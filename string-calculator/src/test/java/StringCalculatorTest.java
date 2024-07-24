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
        Assertions.assertEquals(11 + 5 + 7, stringCalculator.add("11,5,7"));
    }

    @Test
    @DisplayName("The method returns 0 when passed the empty string.")
    void StringCalculatorAddWillReturn0ifArgIsEmpty() {
        Assertions.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    @DisplayName("Allow the Add method to handle an unknown amount of numbers.")
    void StringCalculatorAddWillReturnSumOfUnknownAmountOfNumbersArgs() {
        Assertions.assertEquals(1 + 2 + 3 + 4 + 5 + 6, stringCalculator.add("1,2,3,4,5,6"));
    }

    @Test
    @DisplayName("Allow the Add method to recognise newlines as well as commas as separators. The two separator types can be used interchangeably.")
    void StringCalculatorAddWillReturnSumOfStringArgAfterRemoveNewLineSeparatorIfResist() {
        Assertions.assertEquals(1 + 2 + 3 + 4 + 5 + 6, stringCalculator.add("1,\n2,3,4,\n5,6"));
    }

    /***
     * Optionally support custom separators.
     * To change separator,the beginning of the string will contain a separate line
     */
    @Test
    @DisplayName("Optionally support custom separators.")
    void StringCalculatorAddWillReturnSumOfStringArgAfterRemoveAnyCustomSeparators() {
        Assertions.assertEquals(1 + 2 + 3 + 4 + 5 + 6, stringCalculator.add("1,\n@#;//2,!@#$/3;4@@\n5,6"));
    }

    @Test
    @DisplayName("Calling Add with a negative number will throw an exception negatives not allowed, and the negative that was passed.")
    void StringCalculatorAddWillThrowException() {

        IllegalArgumentException exception1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            stringCalculator.add("-2,1,2,3,4");
        });
        Assertions.assertEquals("negatives not allowed", exception1.getMessage());
    }
    @Test
    @DisplayName("Calling Add with a negative number will throw an exception negatives not allowed, and the negative that was passed.")
    void StringCalculatorAddWillThrowExceptionAndShowTheWrongNumbersIfArgsHasNegativeAnyNumber() {

        IllegalArgumentException exception2 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            stringCalculator.add("-5,-3,-2,1,2,3,4");
        });
        Assertions.assertEquals("negatives not allowed : -5 -3 -2", exception2.getMessage());
    }

    @Test
    @DisplayName("Ignore numbers bigger than 1000.")
    void StringCalculatorAddWillReturnSumOfStringArgAfterIgnoreAnyBiggerThan1000Number() {
        Assertions.assertEquals(13 + 55 + 450, stringCalculator.add("13,55,450,1001"));
    }

    @Test
    @DisplayName("Separators can be of any length if surrounded by square brackets.")
    void StringCalculatorAddWillReturnSumOfStringArgAfterRemoveAnySurroundedBySquareBrackets() {
        Assertions.assertEquals(1 + 2 + 3, stringCalculator.add("//[***]\\n1***2***3"));
    }

    @Test
    @DisplayName("Allow multiple single-character separators.")
    void StringCalculatorAddWillReturnSumOfStringArgAfterRemoveAnyMultipleSingleCharacterSeparators() {
        Assertions.assertEquals(1 + 2 + 3, stringCalculator.add("//[*][%]\\n1*2%3"));
    }

    @Test
    @DisplayName("Handle multiple separators with any character length.")
    void StringCalculatorAddWillReturnSumOfStringArgAfterRemoveAnyMultipleSeparatorsWithAnyCharacterLength() {
        Assertions.assertEquals(1 + 2 + 3, stringCalculator.add("//[foo][bar]\\n1foo2bar3"));
    }
}
