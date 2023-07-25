package codes;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a sentence :");
        String sentence = s.nextLine();
        s.close();
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCounts = new HashMap<>();
        
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}