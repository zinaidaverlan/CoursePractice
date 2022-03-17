package interfaces;

public class MainInterfaces {
    public static void main(String [] args){
        Circle circle=new Circle(5);
        System.out.println("Area of circle="+circle.getArea());
        System.out.println("Perimeter og circle="+circle.getPerimeter());
        Rectangle rectangle=new Rectangle(5,7);
        System.out.println("Area of rectangle="+rectangle.getArea());
        System.out.println("Perimeter of rectangle="+rectangle.getPerimeter());
    }
}
