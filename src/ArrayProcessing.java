import java.util.Arrays;

public class ArrayProcessing {
    public int[] uniqueElements(int[] arr) {
        int[] unique = new int[arr.length];
        int counter = 0;
        for (int arrElem : arr) {
            if(arrElem == 0){
                counter++;
                break;
            }
        }
        for (int elem : arr) {
            boolean isUnique = true;
            for (int uniqueElem : unique) {
                if (elem == uniqueElem) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[counter] = elem;
                counter++;
            }
        }
        int[] finalUniqueArray = new int [counter];
       finalUniqueArray= Arrays.copyOf(unique, counter);
        return finalUniqueArray;
    }
}
