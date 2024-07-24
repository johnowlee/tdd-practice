import java.util.Objects;

public class Player {

    private String name;
    private int point;
    private Score score;

    public Player(String name) {
        this.name = name;
        this.score = Score.LOVE;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public Score getScore() {
        return score;
    }

    public void addPoint() {
        this.point++;
        this.score = Score.getScoreByPoint(this.point);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Player player = (Player) object;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
