import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String str) {
        if (str.length() == 0) {
            return 0;
        }
        // '\\d+' 하나 이상의 연속된 숫자를 의미하는 정규식
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            sum += num;
        }
        return sum;
    }
}
