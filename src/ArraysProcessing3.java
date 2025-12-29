import java.util.Arrays;

public class ArraysProcessing3 {
    public int[] sameElements (int[] array1, int[] array2){
        int [] temp = new int [array1.length + array2.length];
        int counter = 0;
        for (int elem1:array1) {
            boolean isUnique=true;
            for (int elem2:array2) {
                if (elem1==elem2){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                temp[counter] = elem1;
                counter++;
            }
        }
        int[] finalArray = new int [counter];
        finalArray = Arrays.copyOf(temp, counter);
        return finalArray;
    }
}
