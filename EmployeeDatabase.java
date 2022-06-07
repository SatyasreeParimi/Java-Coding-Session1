package JavaPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeDatabase{

   public static void main(String[] args){
   
      Employee[] employees = {
    		  
    		  new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),

    		  new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),

    		  new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),

    		  new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),

    		  new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),

    		  new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),

    		  new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),

    		  new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0),

    		  new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0)};

      List<Employee> list = Arrays.asList(employees);

     System.out.println("Complete Employee list:");
    
     list.stream().forEach(System.out::println);
 //System.out.println( list.stream().collect(Collectors.toList()));
      
      System.out.printf("%nCount of Employees by department:%n"); 
      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));
      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));

   } 
}