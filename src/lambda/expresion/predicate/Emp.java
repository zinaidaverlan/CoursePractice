package lambda.expresion.predicate;

public class Emp {
    String name;
    int performanceRating;
    double salary;

    public Emp(String name, int performanceRating, double salary) {
        this.name = name;
        this.performanceRating = performanceRating;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }
}
