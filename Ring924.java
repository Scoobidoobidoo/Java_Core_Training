public class Ring924 {
    public static void main(String[] args) {
        double Souter = 57;
        double Sinner;
        double S;
        double R = 5;
        double r=0;
        double P = 3.14;
        if (R<=100){
            S = P*Math.pow(R,2);
            Sinner = S-Souter;
            r = Math.sqrt(Sinner/P);
        } System.out.printf("%.2f",r);
    }
}
