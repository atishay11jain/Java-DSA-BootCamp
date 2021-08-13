import java.util.Scanner;

public class InputTill0FindSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ans = 0;
        while (num != 0){
            ans += num;
            num = sc.nextInt();
        }

        System.out.println(ans);
    }
}
