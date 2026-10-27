package StreamApiQuestions;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class MaximumAndMinimumNumbersInAList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22, 45, 10, 8, 91, 57);
        // 9. Find the maximum and minimum numbers in a list.
        // Integer minimumNumber =
        // numbers.stream().min(Comparator.naturalOrder()).get();
        // System.out.println("Minimum number in the list is: "+minimumNumber);

        // Integer maximumNumber =
        // numbers.stream().max(Comparator.naturalOrder()).get();
        // System.out.println("Maximum number in the list is: "+maximumNumber);

        // 10. Sort a list in ascending and descending order using Stream API.
        // Ascending order
        // List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        // System.out.println("Ascending order: " + sortedNumbers);

        // Descending order
        // List<Integer> sortedNumbersDesc = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        // System.out.println("Descending order: " + sortedNumbersDesc);

        //Find Top 3 maximum numbers in a list.
        List<Integer> top3MaximumNumbers = numbers.stream()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .toList();
        System.out.println("Top 3 maximum numbers in the list are: " + top3MaximumNumbers);
        



    }
}
