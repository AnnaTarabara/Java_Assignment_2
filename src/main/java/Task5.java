import java.util.Objects;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string;
        int k;
        int maxLengthOfResult = 1023;
        StringBuilder root = new StringBuilder();

        System.out.println("Enter a sequence of lower-case english letters of length not exceeding 1000 chars:");
        string = scanner.next();

        System.out.println("Enter a positive or negative integer not equal to zero and of abs value less than 100001:");
        k = scanner.nextInt();

        if(k > 0)
        {
            root = new StringBuilder(powered(string, k));
            if(root.length() > maxLengthOfResult){

                for (int i = 0; i < maxLengthOfResult; i++)
                {
                    System.out.println(root.charAt(i));
                }
            }
            else
            {
                System.out.println(powered(string, k));
            }
        }
        else
        {
            k = Math.abs(k);
            for (int i = 0; i < string.length() / k; i++)
            {
                root.append(string.charAt(i));}
                if (Objects.equals(powered(String.valueOf(root), k), string))
                {
                    System.out.println(root);
                }
                else{System.out.println("NO SOLUTION");}
        }
    }
    public static String powered(String string, int k){

        return String.valueOf(string).repeat(k);
    }
}

//Test: abc, 3 --> abcabcabc
//Test: abcdabcd, -2 --> abcd
//Test: abcd, -4 --> NO SOLUTION

//https://acmp.ru/index.asp?main=task&id_task=70