import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        ArraysProcessing2 arraysProcessing2 = new ArraysProcessing2();
        int[] result = arraysProcessing2.twoArrays(new int[]{0, 1, 2, 3, 8, 5}, new int[]{1, 6, 7, 3, -8 });
        System.out.println(Arrays.toString(result));
    }
}

