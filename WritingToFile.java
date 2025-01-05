import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingToFile {
    public static void main(String[] args) {
        PrintWriter pw = null;
        Scanner input = null;
        try {
            pw = new PrintWriter("output.txt");
            input = new Scanner(System.in);
            int total = 0;
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            pw.println("First number entered by user: "+ num1);
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            pw.println("Second number entered by user: "+ num2);
            if (num2 == 0) throw new CustomEXception();
            total = num1 + num2;
            System.out.println("Total of "+num1+ "and "+num2+ " = "+ total);
            pw.println("Total of "+num1+ "and "+num2+ " = "+ total);
            pw.println("\t\t\t\t End of File \t\t\t\t");

        } catch (FileNotFoundException ex) {
            System.out.println("There is an issue in creating a file." + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception  occured " + ex.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
            if (pw != null) {
                pw.close();
            }
        }
    }
}

class CustomEXception extends Exception
{
    CustomEXception() {
        super("Zero number entered by user.");
    }
}