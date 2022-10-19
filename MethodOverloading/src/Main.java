//Overloading a method means having the same method with different number of arguments

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(400);
        calculateScore();
    }

    public static int calculateScore(String playername, int score) {
        System.out.println("Player" + playername + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("0 points.");
        return 0;
    }

}
