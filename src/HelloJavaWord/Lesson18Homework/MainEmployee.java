
/*Create a method that will return the list of all Employees of a company
 that have at least 5 years of activity.*/

package HelloJavaWord.Lesson18Homework;

import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ion", 6);
        Employee emp2 = new Employee("Maria", 4);
        Employee emp3 = new Employee("Dumitru", 10);
        Employee emp4 = new Employee("Ioana", 7);
        Employee emp5 = new Employee("Ana", 1);
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        ArrayList<Employee> list = HandlingEmployee.filterEmployee(employees);
        HandlingEmployee.printEmployee(list);


    }
}
