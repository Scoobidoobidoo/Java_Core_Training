public class FirstOrLast903 {

    public static int firstDigit(int n) {
        while (n >= 10)
            n /= 10;
        return n;
    }

    public static int lastDigit(int n) {
        return (n % 10);
    }

    public static void main(String args[]) {
        int n = 18741;
        if (firstDigit(n) == lastDigit(n)) {
            System.out.println("=");
        } else if ((firstDigit(n)) > (lastDigit(n))) {
            System.out.println(firstDigit(n));
        } else {
            System.out.println(lastDigit(n));
        }

    }
}
