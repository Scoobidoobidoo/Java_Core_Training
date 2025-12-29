
public class Main {
    public static void main(String[] args) {
      Shapes shape1 = new Shapes("Green");
        Circle circle = new Circle("Yellow", 14);
        Rectangle rectangle = new Rectangle("Red", 10, 10);
        Triangle triangle = new Triangle("Beige", 5, 5.6, 7);
        System.out.println(shape1.calcArea());
        System.out.println(shape1);
        System.out.println(circle);
        System.out.println(circle.calcArea());
        System.out.println(rectangle);
        System.out.println(rectangle.calcArea());
        System.out.println(triangle);
        System.out.println(triangle.calcArea());



        Shapes[] array = {new Rectangle("White", 5, 5), new Rectangle("Black", 7, 8), new Rectangle("Gray", 6, 6), new Rectangle("Brown", 7, 4), new Rectangle("Blue", 1, 5),
                new Triangle("Orange", 7, 7, 7), new Triangle("Pink", 4, 5, 6),
                new Circle("Silver", 5), new Circle("Pink", 7)};


        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        for (Shapes shape2 : array) {
            sumArea += shape2.calcArea();
            if (shape2 instanceof Circle) {
                sumCircleArea +=shape2.calcArea();
                System.out.println(shape2 + ", area is " + shape2.calcArea());
            } else if (shape2 instanceof Rectangle) {
                sumRectArea +=shape2.calcArea();
                System.out.println(shape2 + ", area is " + shape2.calcArea());
            } else {
                sumTriangleArea +=shape2.calcArea();
                System.out.println(shape2 + ", area is " + shape2.calcArea());
            }

        }System.out.println("Total area of all shapes in the array = " + sumArea);
        System.out.println("Total Circle area = " + sumCircleArea);
        System.out.println("Total Rectangle area = " + sumRectArea);
        System.out.println("Total Triangle area = " + sumTriangleArea);

    }
}
