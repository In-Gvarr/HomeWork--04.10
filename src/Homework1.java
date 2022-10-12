import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sizeOfString = input.length();

        if (sizeOfString > 10) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int s = input.length();

        char first = input.charAt(0);
        char last = input.charAt(s - 1);
        boolean answer = first == last;

        System.out.println(answer);

    }
}