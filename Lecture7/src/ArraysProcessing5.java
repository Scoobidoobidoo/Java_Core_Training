import java.util.Arrays;

public class ArraysProcessing5 {
    public int[] evenNumbers(int[] array) {
        int[] temp = new int[array.length / 2];
        for (int i = 0; i < array.length; i+=2) {
//            if (i % 2 == 0) {
                temp[i / 2] = array[i];

  //          }
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
                array[i*2] = temp[i];
        }
        return array;
    }
}