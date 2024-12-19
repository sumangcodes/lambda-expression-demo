import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFreq {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
    "apple", "banana", "apple", "orange", "banana", "apple", 
    "pear", "orange", "banana", "pear", "grape", "apple",
    "grape", "banana", "grape", "pear", "pear", "orange"
);

        Map<String, List<String>> wordList=words.stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(wordList);

        // word freq count
        Map<String, Long> wordListCount=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordListCount);

        //convert this list stream to set-
       Set<String> set= words.stream().collect(Collectors.toSet());
       System.out.println(set);

       Map<String,String> map1=words.stream().collect(Collectors.toMap(Function.identity(), String::toUpperCase,
               (existing, replacement) -> existing));
       System.out.println(map1);

       
       
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
       Map<String, List<Integer>> map2 = numbers.stream().collect(Collectors.groupingBy(
               num -> num % 2 == 0 ? "Even" : "Odd", Collectors.mapping(Function.identity(), Collectors.toList())));
               Map<String, List<Integer>> groupedNumbers = numbers.stream()
               .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));

        System.out.println(map2);
        System.out.println(groupedNumbers);

        // I will show you the usecase 
        // Use Case 1: Extracting Specific Fields from Objects
        
        
    }
    
}
