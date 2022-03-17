package principles.oop.PrincipleInterhance.Shape;

public class TreeDimensionalShape extends Shape{
    private int dimension;

    public TreeDimensionalShape(String color, int dimension) {
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
        return "TreeDimensionalShape{" +"color="+getColor()+
                "dimension=" + dimension +
                '}';
    }
}
