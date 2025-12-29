public class NegativeElements_921 {
    public static void main(String[] args) {
        double [] arr = {1, -5, 8.0, -10.9};
        double sum = 0;
        int counter = 0;
        for (double i : arr) {
            if (i < 0) {
                sum += i;
                counter++;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Number of negative elements is " + counter );
    }
}
