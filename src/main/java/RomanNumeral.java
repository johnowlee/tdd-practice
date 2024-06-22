public enum RomanNumeral {
    THOUSAND("M", 1000),
    NINE_HUNDRED("DM", 900),
    FIVE_HUNDRED("D", 500),
    FOUR_HUNDRED("CD", 400),
    HUNDRED("C", 100),
    NINETY("XC", 90),
    FIFTY("L", 50),
    FORTY("XL", 40),
    TEN("X", 10),
    NINE("IX", 9),
    FIVE("V", 5),
    FOUR("IV", 4),
    ONE("I", 1)
    ;

    private String letter;
    private int number;

    RomanNumeral(String letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

}
