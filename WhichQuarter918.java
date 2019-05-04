public class WhichQuarter918 {
    public static void main(String[] args) {
        int x = -10;
        int y = -15;
        if (x<100 && y<100){
            if (x>0 && y>0) {
                System.out.println("Quarter " + 1);
            } else if (x>0 && y<0){
                    System.out.println("Quarter "+2);
                }else if (x<0 && y<0){
                System.out.println("Quarter " + 3);
                    }else if (x<0 && y>0){
                System.out.println("Quarter "+ 4);
            }
        }else {
            System.out.println("Invalid Params");
        }
    }
}
