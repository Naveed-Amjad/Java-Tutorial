public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Program started...");

        // Handling Checked Exception
        try {
            System.out.println("Simulating a checked exception...");
            Thread.sleep(1000); // Throws InterruptedException
            System.out.println("Checked exception handled successfully.");
        } catch (InterruptedException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }

        // Handling Unchecked Exception
        try {
            System.out.println("Simulating an unchecked exception...");
            int result = 10 / 0; // Throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after unchecked exception.");
        }

        System.out.println("Program ended gracefully.");
    }
}
