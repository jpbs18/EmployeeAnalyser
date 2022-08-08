package academy.mindswap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {

    public static List<Employee> sales = new ArrayList<>(Arrays.asList(
            new Employee("Ana","Soares", 24, 1000, 3),
            new Employee("Jorge","Fernandes", 33, 1300, 8),
            new Employee("Filipa","Esteves", 35, 1500, 4),
            new Employee("Pedro","Santos", 30, 1100, 6),
            new Employee("David","Silva", 23, 850, 1),
            new Employee("Sofia","Ferreira", 26, 980, 2),
            new Employee("Diana","Domingues", 27, 1800, 5),
            new Employee("Guilherme","Machado", 41, 2000, 8),
            new Employee("Vera","Couto", 28, 1300, 4),
            new Employee("Laura","Barros", 24, 950, 2)));

    public static List<Employee> humanResources = new ArrayList<>(Arrays.asList(
            new Employee("Veronica","Soares", 27, 1000, 3),
            new Employee("Jaime","Fernandes", 33, 1300, 8),
            new Employee("Filipa","Esteves", 35, 1500, 4),
            new Employee("Pedro","Santos", 30, 1100, 6),
            new Employee("David","Silva", 23, 850, 1),
            new Employee("Silvia","Ferreira", 26, 980, 2),
            new Employee("Monica","Domingues", 27, 1800, 5),
            new Employee("Guilherme","Machado", 41, 2000, 8),
            new Employee("Olivia","Couto", 28, 1300, 4),
            new Employee("Rafael","Barros", 24, 950, 2)));
}
