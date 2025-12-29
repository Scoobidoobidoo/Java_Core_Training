import java.util.Arrays;
public class ArithmeticMean_910 {
    public static void main(String[] args) {
        double [] arr = {2, -5, 5, 10};
        double mean = 0;
        double sum = 0;
        for(double i:arr) {
            if (i > 0) {
                sum += i;
                mean = sum/2;
            }
        }
        System.out.println("Arithmetic Mean of Positive is " + mean);
    }
}
