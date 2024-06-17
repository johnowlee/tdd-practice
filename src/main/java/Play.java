public class Play {
    private Player[] players;
    private Referee referee;

    public Play(Player[] players, Referee referee) {
        this.players = players;
        this.referee = referee;
    }

    public void score(Player player) {
        player.addPoint();
        if (player.getPoint() >= 4) referee.checkGameStatus(player);
    }
}
