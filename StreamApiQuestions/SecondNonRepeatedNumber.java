package StreamApiQuestions;

// import java.util.Map;
// import java.util.Optional;
 import java.util.function.Function;
 import java.util.stream.Collectors;
import java.util.*;
public class SecondNonRepeatedNumber{
    public static void main(String[] args) {
    String words = "cutttack";
    Map<Character,Long> frequency = words.chars()
    .mapToObj(c-> (char) c)
    .collect(Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()
    ));
    System.out.println(frequency);

    Optional<Map.Entry<Character, Long>> secondHighest = frequency.entrySet()
    .stream()
    //find 1st non-repeated character in a string
    //.filter(entry -> entry.getValue() == 1)
    
    //Find 1st repeated character in a string
    //.filter(entry -> entry.getValue() > 1)

    //2nd non repetead character in a string
    .filter(entry -> entry.getValue() == 1)
    .skip(1)
    .findFirst();
    System.out.println(secondHighest.get());
}
}