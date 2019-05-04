public class QuadraticEquation911 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 6;
        double determinant = Math.pow(b, 2) - 4 * a * c;
        if ((Math.abs(a) <= 100) && (Math.abs(b) <= 100) && (Math.abs(c) <= 100)) {
            if (determinant > 0) {
                System.out.println("Two Roots are " + (-b + Math.sqrt(determinant)) / (2 * a)
                        + " and " + (-b - Math.sqrt(determinant)) / (2 * a));
            } else if (determinant == 0) {
                System.out.println("One root is " + -b / (2 * a));
            } else {
                System.out.println("No roots");
            }
        }
    }
}
