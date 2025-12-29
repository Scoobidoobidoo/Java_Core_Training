public class Circle extends Shapes {
    private double radius;

public Circle (String shapeColor ){
    super(shapeColor);
}

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double calcArea() {
    return  Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }
}
