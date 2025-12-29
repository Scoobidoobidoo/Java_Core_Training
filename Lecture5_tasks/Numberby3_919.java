public class Numberby3_919 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 9, 8, -5, -9};
        int counter = 0;
        int sum = 0;
        for (int i = 3; i < arr.length; i += 3) {
            if (arr[i] > 0) {

                sum += arr[i];
                counter++;
            }

        }
        System.out.println(counter);
        System.out.println(sum);
    }
}
