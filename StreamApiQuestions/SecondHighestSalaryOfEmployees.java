package StreamApiQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalaryOfEmployees {
    public static void main(String[] args){
        List<Double> salaries = Arrays.asList(20000.00, 30000.00, 40000.00, 50000.00, 10000.00);
        // Optional<Double> secondHighestSalary = salaries.stream()
        //     .sorted(Comparator.reverseOrder())
        //     .skip(1)
        //     .findFirst();
        // System.out.println("Second highest salary is: " + secondHighestSalary.get());
    
    //Find the top 3 highest-paid employees.
    // List<Double> top3Salaries = salaries.stream()
    //                         .sorted(Comparator.reverseOrder())
    //                         .limit(3)
    //                         .toList();
    //         System.out.println("Top 3 highest salaries are: " + top3Salaries);
    
    //find employees whose salary is greater than 30000.00
    List<Double> salariesGreaterThan30000 = salaries.stream()
                                    .sorted()
                                    .filter(salary -> salary > 30000.00)
                                    .toList();
System.out.println("Salaries greater than 30000.00 are: " + salariesGreaterThan30000);
}   
}
