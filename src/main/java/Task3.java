import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int firstSum = 0;
        int lastSum = 0;
        int j;
        int stringLength;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a ticket number:");
        String string = scanner.next();

        while(string.length() % 2 != 0 || !(string.chars().allMatch(Character::isDigit))){
            System.out.println("Incorrect Input! Please enter even number of digits:");
            string = scanner.next();
        }

        stringLength = string.length();

        j = stringLength - 1;

        for(int i = 0; i < stringLength / 2; i++){

            firstSum += string.charAt(i) - '0';
            lastSum += string.charAt(j) - '0';
            j = j - 1;
        }

        if(firstSum == lastSum){
            System.out.println("Congratulations! You ve got a happy ticket!");
        }
        else{
            System.out.println("Not lucky this time. Try another ticket.");
        }
    }
}
