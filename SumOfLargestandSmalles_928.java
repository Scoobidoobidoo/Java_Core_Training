import java.util.Arrays;

public class SumOfLargestandSmalles_928 {
    public static void main(String[] args) {
        int[] arr = {0,22,3,6,10,5,35};
        int sum=0;
        Arrays.sort(arr);
        sum = arr[0] + arr[arr.length-1];
        System.out.println ("Sum is " + sum);
                }
   }
