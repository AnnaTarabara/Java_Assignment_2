import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String string = scanner.next();
        if(isPalindrome(string)){
            System.out.println("Your word is palindrome!");
        }
        else{System.out.println("Your word is nothing special");}
    }
    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int n = s.length();

        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
