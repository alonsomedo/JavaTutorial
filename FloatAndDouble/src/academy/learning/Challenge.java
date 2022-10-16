package academy.learning;

public class Challenge {
    public static void main(String[] args){
        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;

        System.out.println("Pounds: " + pounds);
        System.out.println("Pounds in Kilograms: " + kilograms);

        double pi = 3.1415927d;
        double number = 3_000_000.4_567_890d;
        System.out.print("Number: " + number);
        System.out.println("Number multiplied by PI: " + (pi*number));

        // float and double are great general floating point operations.
        // nevertheless they are not great to use when we need precision.
        // we should use BigDecimal.
    }
}
