package principles.oop.PrincipleInterhance.Shape;

public class Square extends TwoDimensionalShape{
    public Square(String color, int dimension) {
        super(color, dimension);
    }
    public double areaSquare(){
        return Math.pow(getDimension(),2);
    }
}
