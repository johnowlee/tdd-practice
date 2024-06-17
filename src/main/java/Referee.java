public class Referee {
    private Player[] players;
    private GameStatus gameStatus;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Referee(Player[] players) {
        this.players = players;
    }

    public void checkGameStatus(Player player) {
        checkGameOver(player);
        checkDeuce(player);
        checkAdvantage(player);
    }

    private void checkAdvantage(Player player) {
        if (player.getPoint() - getOpponent(player).getPoint() == 1) {
            this.gameStatus = GameStatus.ADVANTAGE;
        }
    }

    private void checkDeuce(Player player) {
        if (player.getPoint() == getOpponent(player).getPoint()) {
            this.gameStatus = GameStatus.DEUCE;
        }
    }

    private void checkGameOver(Player player) {
        if (player.getPoint() - getOpponent(player).getPoint() == 2) {
            this.gameStatus = GameStatus.OVER;
        }
    }

    private Player getOpponent(Player player) {
        for (Player p : players) {
            if (!p.equals(player)) {
                return p;
            }
        }
        return null;
    }
}
