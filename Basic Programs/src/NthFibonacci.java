import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int ans = nFib(n);
        System.out.println(ans);
    }

    public static int nFib(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a+b;
            a = b;
            b = sum;
        }
      return a;
    }
}
