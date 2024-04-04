import java.util.HashMap;

public class WordCount {
    public static void countWords(String str) {
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word Count:");
        wordCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
    
    public static void main(String[] args) {
        String sentence = "This is a sample sentence for word count sample";
        countWords(sentence);
    }
}
