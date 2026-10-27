package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class SumAndAverageOfNumbersInAList {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3,5,45,6,78,9,1);

        // Sum of numbers in the list
        // int sum = numbers.stream()
        //     .mapToInt(Integer::intValue)
        //     .sum();
        // System.out.println("Sum of numbers in the list is: " + sum);

        // Average of numbers in the list
        // double average = numbers.stream()
        // .mapToInt(Integer::intValue)
        // .average().orElse(0.0);
        // System.out.println("Average of numbers in the list is: " + average);

        //even numbers in the list
        // List<Integer> evenNumbers = numbers.stream()
        // .filter(n -> n % 2 == 0)
        // .toList();
        // System.out.println("Even numbers in the list are: " + evenNumbers);

        //odd numbers in the list
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println("Odd numbers in the list are: " + oddNumbers);

    }
}
