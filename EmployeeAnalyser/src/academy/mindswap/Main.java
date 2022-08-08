package academy.mindswap;

import static academy.mindswap.Util.humanResources;
import static academy.mindswap.Util.sales;

public class Main {
    public static void main(String[] args) {

        System.out.println(Analyser.antique(sales, 4)); // should print 4
        System.out.println(Analyser.aboveSalary(sales, 1200)); // should print [Jorge Fernandes, Filipa Esteves, Diana Domingues, Guilherme Machado, Vera Couto]
        System.out.println(Analyser.oldestEmployees(sales, 3)); // should print [Guilherme Machado, Filipa Esteves, Jorge Fernandes]
        System.out.println(Analyser.firstOldest(sales, 25)); // should print Jorge
        System.out.println(Analyser.averageSalary(sales)); // should print 1278.0
        System.out.println(Analyser.commonFirstName(sales, humanResources)); // should print [Filipa, Pedro, David, Guilherme]

    }

}
