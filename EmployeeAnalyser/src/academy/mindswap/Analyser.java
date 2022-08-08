package academy.mindswap;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Analyser{

    public static int antique(List<Employee> list, int yearsInDepartment) {
        return (int) list.stream().filter(e -> e.getYearsInDepartment() > yearsInDepartment).count();
    }

    public static List<String> aboveSalary(List<Employee> list, int salaryCap) {
        return list.stream().filter(e -> e.getSalary() > salaryCap)
                            .map(e -> e.getFirstName() + " " + e.getLastName())
                            .collect(Collectors.toList());
    }

    public static List<String> oldestEmployees(List<Employee> list, int numberOfEmployees) {
        return list.stream().sorted((a,b) -> b.getAge() - a.getAge())
                            .limit(numberOfEmployees)
                            .map(e -> e.getFirstName() + " " + e.getLastName())
                            .collect(Collectors.toList());
   }

    public static String firstOldest(List<Employee> list, int ageCap) {
        Optional<Employee> a = list.stream().filter(e -> e.getAge() > ageCap).findFirst();
        return a.isPresent() ? a.get().getFirstName() : "No results.";
    }

    public static double averageSalary(List<Employee> list) {
        OptionalDouble a = list.stream().mapToInt(Employee::getSalary).average();
        return a.isPresent() ? a.getAsDouble() : 0.0;
    }

    public static List<String> commonFirstName(List<Employee> list, List<Employee> list2) {
        List<String> a = list.stream().map(Employee::getFirstName).toList();
        List<String> b = list2.stream().map(Employee::getFirstName).toList();

        return a.stream().filter(b::contains).toList();
    }
}
