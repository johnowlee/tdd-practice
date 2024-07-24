import java.util.Arrays;

public enum Score {
    LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3);

    private int point;

    Score(int point) {
        this.point = point;
    }

    public static Score getScoreByPoint(int point) {
        return Arrays.stream(values())
                .filter(s -> s.point == point)
                .findFirst()
                .orElse(null);
    }
}
