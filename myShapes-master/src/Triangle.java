import java.util.Comparator;

public class Triangle extends Shape implements Comparable, Comparator {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = a+ b+ c;
        return Math.sqrt(p*(p-a)*(p-b)*p-c);
    }

    @Override
    public String toString() {
        return super.toString() + ", a= " + a + ", b= " + b + ", c= " + c;
    }

    @Override
    public int compareTo(Object o){
        Triangle triangle = (Triangle) o;
        if(this.calcArea() > triangle.calcArea()) return 1;
        if (this.calcArea() < triangle.calcArea()) return -1;
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
