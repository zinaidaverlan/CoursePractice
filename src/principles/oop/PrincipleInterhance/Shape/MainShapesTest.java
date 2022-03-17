package principles.oop.PrincipleInterhance.Shape;

public class MainShapesTest {
    public static void main(String [] args){
        Circle circle = new Circle("red", 4);
        System.out.println("Area of circle:"+circle.areaCircle());
        Square square=new Square("green",5);
        System.out.println("Area of square:"+square.areaSquare());
        Sphere sphere=new Sphere("blue",3);
        System.out.println("Area of sphere="+sphere.areaOfSphere()+" Volume of sphere="+sphere.volumeOfSphere());
        Cube cube=new Cube("pink",6);
        System.out.println("Area of cube="+cube.areaOfCube()+"  Volume of cube="+cube.volumeOfCube());
    }
}
