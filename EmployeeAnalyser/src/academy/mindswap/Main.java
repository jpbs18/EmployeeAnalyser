package academy.mindswap;

import static academy.mindswap.Util.humanResources;
import static academy.mindswap.Util.sales;

public class Main {
    public static void main(String[] args) {

        System.out.println(Analyser.antique(sales, 4));
        System.out.println(Analyser.aboveSalary(sales, 1200));
        System.out.println(Analyser.oldestEmployees(sales, 3));
        System.out.println(Analyser.firstOldest(sales, 25));
        System.out.println(Analyser.averageSalary(sales));
        System.out.println(Analyser.commonFirstName(sales, humanResources));

    }

}
