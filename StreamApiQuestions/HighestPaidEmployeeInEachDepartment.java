package StreamApiQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeeInEachDepartment {
    public static void main(String[] args){
        //Write a program to find the highest paid employee in each department.
            List<Employee> employees = Arrays.asList(
                new Employee("Ram", "Development", 70000.00),
                new Employee("Hari", "Testing", 60000.00),   
                new Employee("Krishna", "Support", 40000.00),
                new Employee("Shyam", "HR", 45000.00),
                new Employee("Mohan", "Development", 80000.00),
                new Employee("Ramesh", "Testing", 75000.00),    
                new Employee("Sita", "Support", 50000.00),
                new Employee("Gita", "HR", 55000.00));
                
              Map<String, Optional<Employee>> HighestPaidEmployeeInEachDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
                System.out.println("Highest paid employee in each department: " + HighestPaidEmployeeInEachDepartment);
                }

    static class Employee {
        private final String name;
        private final String department;
        private final double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
        @Override
        public String toString() {
            return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
        }
    }
}
