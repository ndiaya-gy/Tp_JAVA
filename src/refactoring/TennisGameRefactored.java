package refactoring;

public class TennisGameRefactored implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    private String player1Name;
    private String player2Name;

    public TennisGameRefactored(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    @Override
    public String getScore() {

        if (isEqualScore()) {
            return getEqualScore();
        }

        if (isEndGame()) {
            return getEndGameScore();
        }

        return getNormalScore();
    }

    private boolean isEqualScore() {
        return player1Score == player2Score;
    }

    private boolean isEndGame() {
        return player1Score >= 4 || player2Score >= 4;
    }

    private String getEqualScore() {
        switch (player1Score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            default: return "Deuce";
        }
    }

    private String getEndGameScore() {
        int diff = player1Score - player2Score;

        if (diff == 1) return "Advantage " + player1Name;
        if (diff == -1) return "Advantage " + player2Name;
        if (diff >= 2) return "Win for " + player1Name;

        return "Win for " + player2Name;
    }

    private String getNormalScore() {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private String getScoreName(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "";
        }
    }
}
