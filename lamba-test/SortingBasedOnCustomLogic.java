import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingBasedOnCustomLogic {

    public static void main(String[] args) {
         List<String> items = Arrays.asList("Banana", "Apple", "Orange");

       List<String> sortedList=  items.stream().sorted(
               Comparator.comparing(Function.identity())).collect(Collectors.toList());

       System.out.println(sortedList);
    }
    
}
