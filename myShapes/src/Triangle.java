public class Triangle extends Shapes{
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
}
