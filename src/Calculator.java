public class Calculator {
    public static double calcPi(int n) {
        double pi = 0;
        double numerator = 4;
        double denominator = 1;
        for (int i = 0; i < n; i++) {
            pi += numerator / denominator;
            denominator += 2;
            numerator *= (-1);

        }
        return pi;
    }
}