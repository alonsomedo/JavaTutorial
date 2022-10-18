public class Challenge {
    public static void main(String[] args) {
        // Create a method called displayHighScorePosition
        // it should receive players name and position in the score table
        int position;

        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Alonso", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Pedro", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Luis", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Jose", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000) {
            position = 1;
        }else if(playerScore >= 500) {
            position = 2;
        }else if(playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}
