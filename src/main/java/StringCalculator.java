public class StringCalculator {
    public int add(String str) {
        if (str.length() == 0) {
            return 0;
        }
        String[] splitStrArr = str.split(",");

        int sum = 0;
        for (String s : splitStrArr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
