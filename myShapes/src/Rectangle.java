public class Rectangle extends Shapes {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width = " + width + ", height = " + height;
    }
}
