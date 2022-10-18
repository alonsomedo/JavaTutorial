public class Exercises {
    public static void main(String[] args) {
        checkNumber(10);
        SpeedConverter.toMilesPerHour(10.25);
        EqualSumChecker.hasEqualSum(1, 1, 1);
        EqualSumChecker.hasEqualSum(1, 1, 2);
        EqualSumChecker.hasEqualSum(1, -1, 0);
    }

    public static void checkNumber(int number){
        if (number > 0) {
            System.out.println("positive");
        }else if (number < 0) {
            System.out.println("negative");
        }else if (number == 0) {
            System.out.println("zero");
        }
    }


}
