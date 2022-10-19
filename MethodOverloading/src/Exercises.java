public class Exercises {

    private static final String INVALID_VALUE_MESSAGE = "Invalid numbers.";

    public static void main(String[] args) {

        double centimeters = calcFeetAndInchesToCentimeters(157);
        System.out.println("Total centimeters: " + centimeters);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }
        double feetToCentimeters = feet * 30.48;
        double inchesToCentimeters = inches * 2.54;
        return feetToCentimeters + inchesToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }
        double inchToFeet = (int ) (inches / 12);
        double remainingInches = (int) (inches % 12);
        return calcFeetAndInchesToCentimeters(inchToFeet, remainingInches);
    }
}

