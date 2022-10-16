package academy.learning;

public class Main {
    public static void main(String[] args){
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        // Strings are classes , they aren't of type primitive.
        // Strings are inmutable
        String myStringFullName = "Pedro Lopez Arias";
        System.out.println("My full name is: " + myStringFullName);

        String numberString = "250.55";
        System.out.println("String number is: " + numberString);
        numberString += "49.95";
        System.out.println("New string number is: " + numberString);

        String lasString = "10";
        int myInt = 50;
        // Java is enough intelligence that cast myInt to String and concatenate it
        lasString = lasString + myInt;
        System.out.println(lasString);
    }
}
