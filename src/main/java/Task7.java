import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = scanner.nextLine();

        String [] words = text.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}

//    public static String powered(String string, int k){
//
//        return string.repeat(k);
//    }

//Test: What a wonderful world! What a wonderful world! she said and sighed, then she became silent for some time. -->
//a: 2
//became: 1
//some: 1
//silent: 1
//sighed: 1
//for: 1
//wonderful: 2
//then: 1
//she: 2
//what: 2
//world: 2
//and: 1
//time: 1
//said: 1