import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int count = 0;
        int maxCount = 0;
        int stringLength;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of zeroes and ones:");
        String string = scanner.next();

        stringLength = string.length();

     for (int i = 0; i < stringLength; i++) {

            if(string.charAt(i) -'0' == 0){ //Integer.parseInt(String.valueOf(character))
                count++;
            }
            else{
                if(count > maxCount){

                    maxCount = count;
                }
                count = 0;
            }
        }
        if(count > maxCount){
            maxCount = count;}

        System.out.println(maxCount);
    }
}

//Test: 110001100000 --> 5
//Test: 00000110010000000000 --> 10
//Test: 1100110000011 -> 5
//Test: 00110000010 --> 5
//Test: 100000001100 --> 7
//Test: 0000001001001 --> 6
//Test: 00000010000000001001 --> 9