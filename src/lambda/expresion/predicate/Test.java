package lambda.expresion.predicate;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Emp e1 = new Emp("Anna", 4, 8999.00);
        Emp e2 = new Emp("John", 10, 15000.00);
        Emp e3 = new Emp("Liza", 2, 7500.00);

        ArrayList<Emp> empArrayList = new ArrayList<>();
        empArrayList.add(e1);
        empArrayList.add(e2);
        empArrayList.add(e3);

        for (Emp e: empArrayList){
            System.out.println(e);
        }
        System.out.println("After deletion:");
        empArrayList.removeIf(e->e.getName().startsWith("A"));

        for (Emp e: empArrayList){
            System.out.println(e);
        }

            Predicate<Emp> predicate = e -> e.getPerformanceRating() >= 5;
        filter(empArrayList, predicate);
    }

    static void filter(ArrayList<Emp> list, Predicate<Emp> rule) {
        for (Emp e : list) {
            if (rule.Test(e)) System.out.println(e);
        }
    }

}
