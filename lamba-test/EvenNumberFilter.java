import java.util.Arrays;

/**
 * 
 * 1. Find All Even Numbers in a List
 * Problem: Given a list of integers, return a list containing only even
 * numbers.
 * Approach: Use filter to retain only even numbers and collect them into a new
 * list.
 */


public class EvenNumberFilter
{

    public static void main(String[] args) {




        int[] numbers = { 2, 7, 4, 9, 12, 15, 18, 23, 26, 31,
                34, 39, 40, 45, 48, 51, 54, 57, 60, 63,
                66, 71, 74, 77, 80, 83, 86, 89, 92, 95,
                98, 101, 104, 107, 110, 113, 116, 119, 122, 125,
                128, 131, 134, 137, 140, 143, 146, 149, 152, 155 };

               Arrays.stream(numbers).filter(num -> num%2==0).mapToObj(num -> Integer.toString(num)+" ").forEach(System.out::print);
        
    }

}