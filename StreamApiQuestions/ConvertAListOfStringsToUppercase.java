package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertAListOfStringsToUppercase {
    public static void main(String[] args){
        List<String> result = Arrays.asList("ram","shyam","mohan");
        List<String> upperCaseResult = result.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println("List of strings in uppercase are: " + upperCaseResult);


    }
    
}
