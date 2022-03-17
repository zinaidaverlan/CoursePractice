package principles.oop.PrincipleInterhance.Shape;

public class Circle extends TwoDimensionalShape {

final double pi=3.14;
    public Circle(String color, int dimension) {
        super(color, dimension);
    }
    public double areaCircle(){
        return pi*Math.pow(getDimension(),2);
    }
}
