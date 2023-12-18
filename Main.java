import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        DigitsOnlyFileReader reader = new DigitsOnlyFileReader("input.txt");

        try {
            System.out.println("File contents: " + reader.readFile());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        System.out.println("Reading file: " + reader.getFilePath());
    }
}
