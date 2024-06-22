public class RomanNumeralConvertor {
    public String convert(int number) {
        StringBuilder romanNumeralBuilder = new StringBuilder();

        for (RomanNumeral romanNumeral : RomanNumeral.values()) {
            int romanNumeralNumber = romanNumeral.getNumber();
            while (number >= romanNumeralNumber) {
                romanNumeralBuilder.append(romanNumeral.getLetter());
                number -= romanNumeralNumber;
            }
        }
        return romanNumeralBuilder.toString();
    }
}