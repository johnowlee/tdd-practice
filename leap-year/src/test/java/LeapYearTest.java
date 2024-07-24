import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    /**
     * A year is not a leap year if not divisible by 4
     * A year is a leap year if divisible by 4
     * A year is a leap year if divisible by 400
     * A year is not a leap year if divisible by 100 but not by 400
     */

    private LeapYearChecker leapYearChecker;

    @BeforeEach
    void setUp() {
        leapYearChecker = new LeapYearChecker();
    }

    @Test
    @DisplayName("return true if year is divisible by 4")
    void LeapYearCheckerCheckReturnTrueIfYearDivisibleBy4() {
        Assertions.assertTrue(leapYearChecker.check(4));
    }

    @Test
    @DisplayName("return false if year is not divisible by 4")
    void LeapYearCheckerCheckReturnFalseIfYearIndivisibleBy4() {
        Assertions.assertFalse(leapYearChecker.check(5));
    }

    @Test
    @DisplayName("return true if year is divisible by 400")
    void LeapYearCheckerCheckReturnTrueIfYearDivisibleBy400() {
        Assertions.assertTrue(leapYearChecker.check(400));
    }

    @Test
    @DisplayName("return false if year is not divisible by 400")
    void LeapYearCheckerCheckReturnFalseIfYearIndivisibleBy400() {
        Assertions.assertFalse(leapYearChecker.check(410));
    }

    @Test
    @DisplayName("return false if year is divisible by 100 but not 400")
    void LeapYearCheckerCheckReturnFalseIfYearDivisibleBy100ButNot400() {
        Assertions.assertFalse(leapYearChecker.check(500));
    }

    @Test
    void finalIntegrationTest() {
        Assertions.assertTrue(leapYearChecker.check(4));
        Assertions.assertTrue(leapYearChecker.check(124));
        Assertions.assertFalse(leapYearChecker.check(100));
        Assertions.assertTrue(leapYearChecker.check(800));
        Assertions.assertFalse(leapYearChecker.check(811));
        Assertions.assertTrue(leapYearChecker.check(2024));
    }
}
