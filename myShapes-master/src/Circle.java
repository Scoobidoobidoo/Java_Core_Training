

public class Circle extends Shape implements Comparable {
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

    @Override
    public int compareTo(Object o){
    Circle circle = (Circle) o;
    if(this.calcArea() > circle.calcArea()) return 1;
    if (this.calcArea() < circle.calcArea()) return -1;
    return 0;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

}
