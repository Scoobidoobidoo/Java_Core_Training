public class Triangle905 {
    public static void main(String[] args) {
        int a =3;
        int b = 100;
        int c = 4;
        if (a<=100 && b<=100 && c<=100){
            if (a==b && a==c){
                System.out.println("1");
            }else if ((a==b && a!=c)||(a==c && a!=b)||(b==c && b!=a)){
                System.out.println("2");
            }else if(a!=b && a!=c && b!=c){
                System.out.println("3");
            }
        }else {
            System.out.println("Sides of a triangle must not exceed 100.");
        }
    }
}
