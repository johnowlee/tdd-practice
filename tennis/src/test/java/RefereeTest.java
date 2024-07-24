import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RefereeTest {

    private Player player1;
    private Player player2;
    private Referee referee;

    @BeforeEach
    void setUp() {
        player1 = new Player("player1");
        player2 = new Player("player2");

        Player[] players = {player1, player2};
        referee = new Referee(players);
    }

    @Test
    @DisplayName("상대방이랑 2포인트 차이가 나면 GameStatus는 OVER이다.")
    void test6() {
        // given
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();

        // when
        referee.checkGameStatus(player1);

        // then
        Assertions.assertEquals(GameStatus.OVER, referee.getGameStatus());
    }

    @Test
    @DisplayName("상대방이랑 포인트가 같으면 GameStatus는 DEUCE이다.")
    void test7() {
        // given
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();

        player2.addPoint();
        player2.addPoint();
        player2.addPoint();
        player2.addPoint();

        // when
        referee.checkGameStatus(player1);

        // then
        Assertions.assertEquals(GameStatus.DEUCE, referee.getGameStatus());
    }

    @Test
    @DisplayName("상대방이랑 1포인트 차이가 나면 GameStatus는 ADVANTAGE이다.")
    void test8() {
        // given
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();
        player1.addPoint();

        player2.addPoint();
        player2.addPoint();
        player2.addPoint();

        // when
        referee.checkGameStatus(player1);

        // then
        Assertions.assertEquals(GameStatus.ADVANTAGE, referee.getGameStatus());
    }
}
