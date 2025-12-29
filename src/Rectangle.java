import java.util.Comparator;

public class Rectangle extends Shape implements Comparable, Comparator{

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

    @Override
    public int compareTo(Object o){
        Rectangle rectangle = (Rectangle) o;
        if(this.calcArea() > rectangle.calcArea()) return 1;
        if (this.calcArea() < rectangle.calcArea()) return -1;
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
