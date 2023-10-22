package ss08_mvc.exercise.tennis_game;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;
    private static final String LOVE_STRING = "Love";
    private static final String FIFTEEN_STRING = "Fifteen";
    private static final String THIRTY_STRING = "Thirty";
    private static final String FORTY_STRING = "Forty";
    private static final String ALL_STRING = "All";
    private static final String DEUCE_STRING = "Deuce";
    private static final String SEPARATOR = "-";

    private static String getEqualsScore(int playerScore) {
        switch (playerScore) {
            case LOVE:
                return LOVE_STRING + SEPARATOR + ALL_STRING;
            case FIFTEEN:
                return FIFTEEN_STRING + SEPARATOR + ALL_STRING;
            case THIRTY:
                return THIRTY_STRING + SEPARATOR + ALL_STRING;
            case FORTY:
                return FORTY_STRING + SEPARATOR + ALL_STRING;
            default:
                return DEUCE_STRING;
        }
    }

    private static String getFinalScore(int player1Score, int player2Score) {
        int scoreDifferent = player1Score - player2Score;
        if (scoreDifferent == 1) {
            return "Advantage player1";
        } else if (scoreDifferent == -1) {
            return "Advantage player2";
        } else if (scoreDifferent >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getNonEqualsScore(int player1Score, int player2Score) {
        StringBuilder result = new StringBuilder();
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                result.append(SEPARATOR);
                tempScore = player2Score;
            }
            switch (tempScore) {
                case LOVE:
                    result.append(LOVE_STRING);
                    break;
                case FIFTEEN:
                    result.append(FIFTEEN_STRING);
                    break;
                case THIRTY:
                    result.append(THIRTY_STRING);
                    break;
                case FORTY:
                    result.append(FORTY_STRING);
                    break;
            }
        }
        return result.toString();
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isScoreEquals = player1Score == player2Score;
        boolean isScoreFinal = player1Score >= 4 || player2Score >= 4;

        if (isScoreEquals) {
            return getEqualsScore(player1Score);
        } else if (isScoreFinal) {
            return getFinalScore(player1Score, player2Score);
        } else {
            return getNonEqualsScore(player1Score, player2Score);
        }
    }
}
