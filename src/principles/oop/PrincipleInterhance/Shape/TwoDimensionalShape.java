package principles.oop.PrincipleInterhance.Shape;

public class TwoDimensionalShape extends Shape {
    private int dimension;


    public TwoDimensionalShape(String color) {
        super(color);
    }

    public TwoDimensionalShape(String color, int dimension) {
        super(color);
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "TwoDimensionalShape{" +
                "dimension=" + dimension + "color=" + getColor() +
                '}';
    }
}
