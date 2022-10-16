package academy.learning;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result: " + previousResult);

        result = result -1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = (result / 5);
        System.out.println("20 / 5 = " + result);

        result = (result % 3);
        System.out.println("4 % 3 = " + result);

        boolean isAlien = false;
        if (!isAlien){
            System.out.println("Is not an Alien");
        }else{
            System.out.println("Is an Alien");
        }

        int firstScore = 81;
        int secondScore = 56;
        int topScore = 90;
        if (firstScore > topScore){
            System.out.println("Your score is higher.");
        }else {
            System.out.println("Computer score is higher.");
        }

        if (topScore > firstScore && firstScore > secondScore){
            System.out.println("Computer > 1st Player > 2nd Player");
        }

        if (firstScore > topScore || secondScore > topScore){
            System.out.println("Computer lost.");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("Values are equal.");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("It's a car.");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient > 18 ? true:false;
        if(isEighteenOrOver)
            System.out.println("It's an adult.");



    }
}
