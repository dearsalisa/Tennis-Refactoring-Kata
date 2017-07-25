public class TennisGame2 implements TennisGame {

    public int P1point = 0;
    public int P2point = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public String getScore() {

        String[] scoreText = {"Love", "Fifteen", "Thirty", "Forty", ""};

        if (P1point == P2point && P1point <= 2) {
            return scoreText[P1point] + "-All";
        }
        if (P1point == P2point && P1point >= 3) {
            return "Deuce";
        }
        if (P1point != P2point && P2point < 4 && P1point < 4) {
            return scoreText[P1point] + "-" + scoreText[P2point];
        }
        if (Math.abs(P1point - P2point) == 1) {
            if (P1point > P2point) {
                return String.format("Advantage %s", player1Name);
            }
            if (P2point > P1point) {
                return String.format("Advantage %s", player2Name);
            }
        }
        if (Math.abs(P1point - P2point) >= 2) {
            if (P1point > P2point) {
                return String.format("Win for %s", player1Name);
            }
            if (P2point > P1point) {
                return String.format("Win for %s", player2Name);
            }
        }
        return "";
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}