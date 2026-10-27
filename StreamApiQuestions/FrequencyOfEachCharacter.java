// package StreamApiQuestions;

// import java.util.Collections;
// import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

// public class FrequencyOfEachCharacter {
//     public static void main(String[] args) {
//     String words = "Banana";
//     Map<Character,Long> frequency = words.chars()
//     .mapToObj(c-> (char) c)
//     .collect(Collectors.groupingBy(
//         Function.identity(),  
//         LinkedHashMap::new,   // to maintain the order of characters    
//         Collectors.counting()            
//     ));

//     System.out.println(frequency);
// }
// }