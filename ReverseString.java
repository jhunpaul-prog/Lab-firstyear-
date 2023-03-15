import java.util.Scanner;

public class ReverseString {

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static String reverseString(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = inputString();
        String reversed = reverseString(input);
        System.out.println("Output: " + reversed);
    }
}