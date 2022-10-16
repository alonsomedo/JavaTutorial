package academy.learning;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min float value: " + myMinFloatValue);
        System.out.println("My max float value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My min Double value: " + myMinDoubleValue);
        System.out.println("My max Double value: " + myMaxDoubleValue);

        int myIntValue = 5;
        // If we don't add the "f" Java will assume it's of type Double
        // As Double is the default data type for floating point numbers.
        float myFirstFloatValue = 5.25f;
        float myFloatValue = (float)5.25;
        double myDoubleValue = 5.25d;

        float dividedFloatValue = 5f/3f;
        double dividedDoubleValue = 5d/3d;

        // As we can see double is more precise and has more precision than float
        System.out.println("Float Value: " + dividedFloatValue);
        System.out.println("Double Value: " + dividedDoubleValue);

    }
}
