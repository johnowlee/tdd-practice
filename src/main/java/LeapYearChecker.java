public class LeapYearChecker {

    public boolean check(int year) {
        if (isDivisibleBy100And400(year)) {
            return true;
        }
        if (isDivisibleBy100(year)){
            return false;
        }
        if (isDivisibleBy4(year)) {
            return true;
        }
        return false;
    }

    private static boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private static boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    private static boolean isDivisibleBy100And400(int year) {
        return year % 100 == 0 && year % 400 == 0;
    }
}
