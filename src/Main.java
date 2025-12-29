import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int[] result = arrayProcessing.uniqueElements(new int[]{1, 2, 3, 2, 5, 0, 0});
        System.out.println(Arrays.toString(result));
    }
}
