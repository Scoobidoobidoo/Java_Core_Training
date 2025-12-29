import java.util.Arrays;

public class MaxofAbsolute_914 {
    public static void main(String[] args) {
        int[] arr = {-98, 5, -75, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
            }
        }
        Arrays.sort(arr);
        System.out.println("Maximum of Absolute values is " + arr[arr.length - 1]);
    }
}
