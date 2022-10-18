public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1699;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver, score, levelCompleted, bonus);
        score = calculateScoreReturnValue(true, 500, 6, 100);
    }

    public static void calculateScoreWithoutArguments() {
        boolean gameOver = true;
        int score = 1699;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreReturnValue(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else {
            return -1;
        }

    }
}
