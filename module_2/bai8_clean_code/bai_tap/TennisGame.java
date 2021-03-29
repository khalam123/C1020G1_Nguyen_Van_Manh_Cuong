package bai8_clean_code.bai_tap;
public class TennisGame {

    public static String getScore(String player1, String player2, int m_score1, int m_score2) {
        StringBuilder score = new StringBuilder();
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case 0:
                    return "Love-All";
                case 1:
                    return "Fifteen-All";
                case 2:
                    return "Thirty-All";
                case 3:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }
        else if (m_score1>=4 || m_score2>=4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) return "Advantage player1";
            else if (minusResult == -1) return "Advantage player2";
            else if (minusResult >= 2) return "Win for player1";
            else return "Win for player2";
        }
        else {
            for (int i=1; i<3; i++) {
                int tempScore;
                if (i==1) tempScore = m_score1;
                else { score.append("-"); tempScore = m_score2;}
                switch(tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}