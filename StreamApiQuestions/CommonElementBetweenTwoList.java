package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CommonElementBetweenTwoList {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
        // List<Integer> commonElements = list1.stream()
        //             .filter(list2::contains)
        //             .collect(Collectors.toList());
        // System.out.println("Common elements in both lists are: " + commonElements);

        //2nd way to find common elements between two lists

       List<Integer> commonElements =  Stream.concat(list1.stream(), list2.stream())
                      .collect(Collectors.groupingBy(
                              Function.identity(),
                              Collectors.counting()))
                      .entrySet()
                      .stream()
                      .filter(entry -> entry.getValue() >= 2)
                      .map(Map.Entry::getKey)
                      .collect(Collectors.toList());

        System.out.println(commonElements);
                   
    }
}
