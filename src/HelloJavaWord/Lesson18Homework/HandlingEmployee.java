package HelloJavaWord.Lesson18Homework;

import java.util.ArrayList;

public class HandlingEmployee {
    public static ArrayList<Employee> filterEmployee(Employee[] employees){
        ArrayList<Employee> list= new ArrayList<>();
        for (Employee employee: employees)
        { if (employee.getYearsOfActivity()>=5){
            list.add(employee);
        }}

        return list;
    }

    public static  void  printEmployee(ArrayList<Employee> list){
        for(Employee employee:list){
            System.out.println(employee);
        }
    }
}
