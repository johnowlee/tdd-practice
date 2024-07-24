import org.junit.jupiter.api.BeforeEach;

public class PlayTest {

    private Player player1;
    private Player player2;
    private Referee referee;
    private Play play;

    @BeforeEach
    void setUp() {
        player1 = new Player("player1");
        player2 = new Player("player2");

        Player[] players = {player1, player2};
        referee = new Referee(players);

        play = new Play(players, referee);
    }
}
