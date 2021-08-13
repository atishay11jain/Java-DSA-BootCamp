import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int num = sc.nextInt();

       int ans = reverse(num);
        System.out.println(ans);
    }

    public static int reverse(int num){
        int ans = 0;
        while (num != 0){
            int rem = num % 10;
            ans = rem + ans*10;
            num /= 10;
        }
        return ans;
    }
}
