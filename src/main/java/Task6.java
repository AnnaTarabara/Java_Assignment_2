import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int outputStringLength= 40;
        int count = 0;
        int placeholder = 10;
        int stringLength;
        char character;
        String string;

        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a packed line:");

        string = scanner.nextLine();
        stringLength = string.length();

        for (int i = 0; i < stringLength; i++) {

            character = string.charAt(i);
            if (Character.isDigit(character)) {

                count = count * placeholder + (character - '0'); //Integer.parseInt(String.valueOf(character))

            } else {
                if (count == 0) {

                    result.append(character);
                } else {

                    result.append(String.valueOf(character).repeat(count));
                    count = 0;
                }
            }
        }

        for (int i = 0; i < result.length(); i += outputStringLength) {
            if(result.length() >= i + outputStringLength) {
                System.out.println(result.substring(i, i + outputStringLength) + "\n");
            }
            else{System.out.println(result.substring(i));}

        }
        }}


//Test1: 3A4B7D --> 	AAABBBBDDDDDDD
//Test2: 40AB39A -->
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//BAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//Test3: 22D7AC18FGD -->
//DDDDDDDDDDDDDDDDDDDDDDAAAAAAACFFFFFFFFFF
//FFFFFFFFGD

//https://acmp.ru/index.asp?main=task&id_task=231
