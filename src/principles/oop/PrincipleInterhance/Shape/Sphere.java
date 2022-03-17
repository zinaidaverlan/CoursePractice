package principles.oop.PrincipleInterhance.Shape;

public class Sphere extends TreeDimensionalShape{
    final double pi=3.14;

    public Sphere(String color, int dimension) {
        super(color, dimension);
    }
    public double areaOfSphere(){
        return 4*pi*Math.pow(getDimension(),2);
    }
    public double volumeOfSphere(){
        return 4/3*pi*Math.pow(getDimension(),3);
    }
}
