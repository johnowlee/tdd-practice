import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    
    private static final String ONLY_NUMBER_REGEX = "-?\\d+";
    
    private List<Integer> negativeNums = new ArrayList<>();
    
    
    public int add(String str) {
        if (isEmpty(str)) return 0;
        return getSum(str);
    }

    private static boolean isEmpty(String str) {
        return str.length() == 0;
    }

    private int getSum(String str) {
        int sum = 0;
        Matcher matcher = getCompiledPattern().matcher(str);
        while (matcher.find()) {
            int num = getNumber(matcher);
            if (isNegative(num)) continue;
            if (isBiggerThan1000(num)) continue;
            sum += num;
        }

        validateNegativeNumbers(negativeNums);
        return sum;
    }

    private static boolean isBiggerThan1000(int num) {
        return num > 1000;
    }

    private static int getNumber(Matcher matcher) {
        return Integer.parseInt(matcher.group());
    }

    private boolean isNegative(int num) {
        if (num < 0) {
            negativeNums.add(num);
            return true;
        }
        return false;
    }

    private static Pattern getCompiledPattern() {
        return Pattern.compile(ONLY_NUMBER_REGEX);
    }

    private static void validateNegativeNumbers(List<Integer> negativeNums) {
        if (negativeNums.size() == 1) {
            throw new IllegalArgumentException("negatives not allowed");
        }
        if (negativeNums.size() > 1) {
            throw new IllegalArgumentException("negatives not allowed : " + extractNegativeNumbers(negativeNums));
        }
    }

    private static StringBuilder extractNegativeNumbers(List<Integer> negativeNums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < negativeNums.size(); i++) {
            sb.append(negativeNums.get(i));
            if (isNotLastIndex(negativeNums.size(), i)) {
                sb.append(" ");
            }
        }
        return sb;
    }

    private static boolean isNotLastIndex(int negativeNumsSize, int i) {
        return i != negativeNumsSize - 1;
    }
}
