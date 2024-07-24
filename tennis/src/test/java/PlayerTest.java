import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Player player1;
    private Player player2;

    @BeforeEach
    void setUp() {
        player1 = new Player("player1");
        player2 = new Player("player2");
    }
    @Test
    @DisplayName("addPoint를 실행하면 포인트가 1씩 증가한다.")
    void addPointTest() {
        // when&then
        Assertions.assertEquals(0, player1.getPoint());
        player1.addPoint();
        Assertions.assertEquals(1, player1.getPoint());
        player1.addPoint();
        Assertions.assertEquals(2, player1.getPoint());
    }

    @Test
    @DisplayName("포인트가 0이면 스코어는 LOVE이다.")
    void scoreTest1() {
        // given
        // when&then
        Assertions.assertEquals(Score.LOVE, player1.getScore());
    }

    @Test
    @DisplayName("포인트가 1이면 스코어는 FIFTEEN이다.")
    void scoreTets2() {
        // given
        player1.addPoint();

        // when&then
        Assertions.assertEquals(Score.FIFTEEN, player1.getScore());
    }

    @Test
    @DisplayName("포인트가 2이면 스코어는 THIRTY이다.")
    void scoreTets3() {
        // given
        player1.addPoint();
        player1.addPoint();

        // when&then
        Assertions.assertEquals(Score.THIRTY, player1.getScore());
    }

    @Test
    @DisplayName("포인트가 3이면 스코어는 FORTY이다.")
    void scoreTets4() {
        // given
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();

        // when&then
        Assertions.assertEquals(Score.FORTY, player1.getScore());
    }
}
