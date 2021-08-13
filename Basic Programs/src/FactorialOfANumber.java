import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ans = fact(num);
        System.out.println(ans);
    }

    public static int fact(int num){
         int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }

        return ans;
    }
}
