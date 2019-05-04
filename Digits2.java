public class Digits2 {
    public static void main(String[] args) {
        int Number = 244975999;
        int Count = 0;
        while ((Number > 0) && (Number < 2 * Math.pow(10, 9))) {
            Number = Number / 10;
            Count = Count + 1;
        }
            System.out.println(Count);
    }
}