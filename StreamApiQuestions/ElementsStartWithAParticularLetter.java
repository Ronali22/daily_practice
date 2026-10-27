package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;

public class ElementsStartWithAParticularLetter {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Anil","Amit","Ramesh","Suresh","Ankit","Rakesh");
        //Find elements starting with a particular letter in a list.
        List<String> filteredNames = names.stream()
            .filter(n->n.charAt(0)=='A')
            .toList();
            System.out.println("Elements starting with letter A are: " + filteredNames);
    }
    
}
