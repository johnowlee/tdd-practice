import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    /**
     * 1	2	3	4	5	6	7	8	9
     * I	II	III	IV	V	VI	VII	VIII	IX
     *
     * 10	20	30	40	50	60	70	80	90
     * X	XX	XXX	XL	L	LX	LXX	LXXX	XC
     *
     * 100	200	300	400	500	600	700	800	900
     * C	CC	CCC	CD	D	DC	DCC	DCCC	CM
     *
     * More examples:
     * Number	Numeral
     * 4	IV
     * 9	IX
     * 29	XXIX
     * 80	LXXX
     * 294	CCXCIV
     * 2019	MMXIX
     */

    @Test
    void convertTest1() {
        RomanNumeralConvertor convertor = new RomanNumeralConvertor();
        Assertions.assertEquals("I", convertor.convert(1));
        Assertions.assertEquals("III", convertor.convert(3));
        Assertions.assertEquals("V", convertor.convert(5));
        Assertions.assertEquals("VII", convertor.convert(7));
    }

    @Test
    void convertTest2() {
        RomanNumeralConvertor convertor = new RomanNumeralConvertor();
        Assertions.assertEquals("X", convertor.convert(10));
        Assertions.assertEquals("XV", convertor.convert(15));
        Assertions.assertEquals("XVI", convertor.convert(16));
        Assertions.assertEquals("XXX", convertor.convert(30));
    }

    @Test
    void convertTest3() {
        RomanNumeralConvertor convertor = new RomanNumeralConvertor();
        Assertions.assertEquals("L", convertor.convert(50));
        Assertions.assertEquals("LV", convertor.convert(55));
        Assertions.assertEquals("LX", convertor.convert(60));
        Assertions.assertEquals("LXV", convertor.convert(65));
    }

    @Test
    void convertTest4() {
        RomanNumeralConvertor convertor = new RomanNumeralConvertor();
        Assertions.assertEquals("C", convertor.convert(100));
        Assertions.assertEquals("CLV", convertor.convert(155));
        Assertions.assertEquals("CLX", convertor.convert(160));
        Assertions.assertEquals("CLXV", convertor.convert(165));
    }

    @Test
    void convertTest5() {
        RomanNumeralConvertor convertor = new RomanNumeralConvertor();
        Assertions.assertEquals("M", convertor.convert(1000));
        Assertions.assertEquals("MCLV", convertor.convert(1155));
        Assertions.assertEquals("MCLX", convertor.convert(1160));
        Assertions.assertEquals("MCLXV", convertor.convert(1165));
    }

    @Test
    void convertFinalTest() {
        RomanNumeralConvertor convertor = new RomanNumeralConvertor();
        Assertions.assertEquals("IV", convertor.convert(4));
        Assertions.assertEquals("IX", convertor.convert(9));
        Assertions.assertEquals("XXIX", convertor.convert(29));
        Assertions.assertEquals("LXXX", convertor.convert(80));
        Assertions.assertEquals("CCXCIV", convertor.convert(294));
        Assertions.assertEquals("MMXIX", convertor.convert(2019));
    }
}
