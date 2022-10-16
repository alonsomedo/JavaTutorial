package academy.learning;

public class Main {
    public static void main(String [] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Min Value: " + myMinIntValue);
        System.out.println("Max Value: " + myMaxIntValue);
        
        int myMaxIntTest = 2_147_483_647;
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value: " + myMinlongValue);
        System.out.println("Long Max Value: " + myMaxlongValue);

        int myTotal = (myMinIntValue / 2);

        // What is in the parenthesis is treated like an Int
        // We need to cast it to Byte
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);
        
    }
}
