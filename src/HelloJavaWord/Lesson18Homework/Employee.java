package HelloJavaWord.Lesson18Homework;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int yearsOfActivity;

    public Employee(String name, int yearsOfActivity) {
        this.name = name;
        this.yearsOfActivity = yearsOfActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(int yearsOfActivity) {
        this.yearsOfActivity = validateYearsOfActivity(yearsOfActivity)?yearsOfActivity:0;
    }

    private boolean validateYearsOfActivity(int yearsOfActivity) {
        return yearsOfActivity>0 && yearsOfActivity<40;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearsOfActivity=" + yearsOfActivity +
                '}';
    }
}
