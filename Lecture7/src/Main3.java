import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        ArraysProcessing3 arraysProcessing3 = new ArraysProcessing3();
        int[] result = arraysProcessing3.sameElements(new int[]{0, 1, 2, 3, 8, 5}, new int[]{1, 6, 7, 3, -8, 8, 0});
        System.out.println(Arrays.toString(result));
    }
}

