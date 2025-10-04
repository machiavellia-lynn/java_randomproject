package mathmethods;

public class MathMethods {

    public static void main(String[] args) {
        // Power
        double power = Math.pow(3, 2);
        System.out.println("3 raised to the power of 2 is " + power);

        // Square root
        double root = Math.sqrt(49);
        System.out.println("The square root of 49 is " + root);

        // Absolute value
        double abs = Math.abs(-15.7);
        System.out.println("The absolute value of -15.7 is " + abs);

        // Trigonometry
        double radians = Math.toRadians(30); // Convert degrees to radians
        double sine = Math.sin(radians);
        System.out.println("The sine of 30 degrees is " + sine);

        // Rounding
        double roundUp = Math.ceil(4.3);
        double roundDown = Math.floor(4.7);
        double roundNearest = Math.round(4.5);
        System.out.println("Ceiling of 4.3 is " + roundUp);
        System.out.println("Floor of 4.7 is " + roundDown);
        System.out.println("Rounded value of 4.5 is " + roundNearest);

        // Random number
        double random = Math.random(); // Returns a value between 0.0 and 1.0
        System.out.println("A random number between 0.0 and 1.0: " + random);
    }

}