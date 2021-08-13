import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rs = sc.nextInt();

        double dollar = rupeeToDollar(rs);
        System.out.println("Rupee to dollar " + dollar);
       double rupee = dollarToRupee(rs);
        System.out.println("Dollar to rupee "+rupee);
    }

    public static double rupeeToDollar(int rs){
        return 0.0134647*rs;
    }
    public static double dollarToRupee(int rs){
        return 74.2883*rs;
    }
}
