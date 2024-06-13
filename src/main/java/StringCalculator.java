public class StringCalculator {
    public int add(String str) {
        if (str.length() == 0) {
            return 0;
        }
        String strRemovedNewLineSeparator = str.replaceAll("\n", "");
        String[] strArrSplitByComma = strRemovedNewLineSeparator.split(",");

        int sum = 0;
        for (String s : strArrSplitByComma) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
