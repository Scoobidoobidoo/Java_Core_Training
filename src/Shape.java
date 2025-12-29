import java.util.Comparator;

public abstract class Shape implements Drawable, Comparator {
private String shapeColor;

    public abstract double calcArea();
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(toString() + "area: " + calcArea());
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName()+ ", color is " + shapeColor;
    }

   /* public int compare (Object o1, Object o2){
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        return shape1.shapeColor.compareTo(shape2.shapeColor);

    }*/
}
