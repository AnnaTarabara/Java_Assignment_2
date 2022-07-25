import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String string1;
        String string2;
        int bulls;
        int cows;


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a sequence of digits and/or chars without space");
        string1 = scanner.next();

//        System.out.println("Enter a sequence of digits and/or chars without space");
        string2 = scanner.next();

        bulls = bullCount(string1, string2);
        cows = cowCount(string1, string2);

        System.out.println(bulls + " " + cows);

}

    public static int bullCount(String string1, String string2){

        int bullCount = 0;

        for(int index = 0; index < string1.length(); index++){
            if(string1.charAt(index) == string2.charAt(index)){
                bullCount++;
            }

    }
        return bullCount;
    }
    public static int cowCount(String string1, String string2){

        int cowCount = 0;

        for (int index = 0; index < string1.length(); index++){

            if (string1.charAt(index) != string2.charAt(index) && string2.indexOf(string1.charAt(index)) != -1){

                cowCount++;
            }
        }
        return cowCount;
    }
}

//Test: 5671 7251 --> 1 2
//Test: 1234 1234 --> 4 0
//Test: 2034 6234 --> 2 1

//https://acmp.ru/index.asp?main=task&id_task=13