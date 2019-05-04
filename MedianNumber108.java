public class MedianNumber108 {
    public static void main(String[] args) {
        int a = 18;
        int b = 5;
        int c = 10;
        if ((a < b && b < c) || (c < b && b < a)) {
            System.out.println(b);
        } else if ((b < a && a < c) || (c < a && a < b)) {
            System.out.println(c);
        } else {
            System.out.println(c);
        }
    }
}