
import java.util.Scanner;

public class ExtractASubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();
        String substring = extractSubstring(input, startIndex, endIndex);
        System.out.println("Extracted substring: " + substring);
        scanner.close();
    }

    public static String extractSubstring(String input, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > input.length() || startIndex > endIndex) {
            throw new StringIndexOutOfBoundsException("Invalid start or end index");
        }

        return input.substring(startIndex, endIndex);
    }
}

