import java.util.Scanner;

public class Task2_reverse
{
    public static void main(String[] args) {

        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();

        String reverseString = new StringBuilder(original).reverse().toString();

        if (original.equals(reverseString)) {
            System.out.println("Your word is a palindrome.");
        } else {
            System.out.println("Your word is not a palindrome.");
        }
    }
}