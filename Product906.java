public class Product906 {
    public static void main(String[] args) {
        int q=560;
        int product = 1;
        while(q != 0) {
            product *= q % 10;
            q /= 10;
        }
        System.out.println(product);
    }
}
