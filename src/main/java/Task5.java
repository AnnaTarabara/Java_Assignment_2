import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string;
        int k;
        int maxLengthOfResult = 1023;
        StringBuilder root = new StringBuilder();

        string = scanner.next();

        k = scanner.nextInt();

        if(k > 0)
        {
            if(string.length() * k > maxLengthOfResult){

                do {
                    root.append(string);
                } while (root.length() < maxLengthOfResult);

                System.out.println(root.substring(0, maxLengthOfResult));

            }
            else
            {
                System.out.println(string.repeat(k));
            }
        }
        else
        {
            k = k * (-1);
            for (int i = 0; i < string.length() / k; i++)
            {
                root.append(string.charAt(i));}
                if (String.valueOf(root).repeat(k).equals(string))
                {
                    System.out.println(root);
                }
                else{System.out.println("NO SOLUTION");}
        }
    }
}

//Test: abc, 3 --> abcabcabc
//Test: abcdabcd, -2 --> abcd
//Test: abcd, -4 --> NO SOLUTION

//https://acmp.ru/index.asp?main=task&id_task=70