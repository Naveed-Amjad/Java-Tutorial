import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesReading {
    public static void main(String[] args) {
        String fileName = "C:/Java-Tutorial/example.txt";
        String word = "line";

        File fileIn = new File(fileName);

        Scanner fileScan = null;

        try{
            fileScan = new Scanner(fileIn);
            int lineCount = 1;

            while(fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if (line.contains(word))
                {
                    System.out.println(lineCount + ": " + line);
                }
                lineCount++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        } catch (Exception ex) {
            System.out.println("Argument are not passed from command line");
        }
    }
}
