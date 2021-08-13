import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
      double r = sc.nextDouble();
        int t = sc.nextInt();

        double ans = s_i(p,r,t);
        System.out.println(ans);
    }

    public static double  s_i(int p,double r,int t){
        double ans = (p*r*t)/100;
        return ans;
    }
}
