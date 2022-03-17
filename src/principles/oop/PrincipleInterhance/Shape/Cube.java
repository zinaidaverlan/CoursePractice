package principles.oop.PrincipleInterhance.Shape;

public class Cube extends TreeDimensionalShape {
    public Cube(String color, int dimension) {
        super(color, dimension);
    }
    public double areaOfCube(){
        return 6*Math.pow(getDimension(),2);
    }
    public double volumeOfCube(){
        return Math.pow(getDimension(),3);
    }
}
