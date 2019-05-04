public class RectangularOrNot915 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int hypotenuse = 5;
        if ((a <= 1000) && (b <= 1000) && (hypotenuse <= 1000)) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Enter values that are <=1000");
        }
    }
}