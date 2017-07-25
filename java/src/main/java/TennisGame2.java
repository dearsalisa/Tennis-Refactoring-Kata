
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void P1Score(){ P1point++; }
    public void P2Score(){ P2point++; }

    public String getScore(){

        String[] scoreText = {"Love", "Fifteen", "Thirty", "Forty", ""};
        String score = "";

//        if (isEqualScore()) {
//        } else if (isNormalScore()) {
//        } else if (isDeuce()) {
//            return "Deuce";
//        } else if (isAdvantage()) {
//        } else if (isWin()) {
//        } else return "Invalid Input";


        if (P1point == P2point && P1point < 4)
        {
            score = scoreText[P1point]+"-All";
        }
        if (P1point==P2point && P1point>=3) {
            score = "Deuce";
        }
        if ( P1point != P2point && P2point < 4 && P1point < 4)
        {
            score = scoreText[P1point] + "-" + scoreText[P2point];
        }

        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }

        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }


}