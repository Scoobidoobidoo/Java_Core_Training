public class Math {
    public static final double PI = 3.14;

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if (min >= element) {
                min = element;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int elem : arr) {
            if (max <= elem) {
                max = elem;
            }

        }
        return max;
    }
    public static double areaOfCircle(double radius){
        double area = radius* radius* PI;
        return area;
    }
}
