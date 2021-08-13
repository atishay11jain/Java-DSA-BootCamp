import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int num = sc.nextInt();
        int digit = sc.nextInt();

        int ans = countFre(num,digit);
        System.out.println(ans);
    }

    public static int countFre(int num,int dig){
        int fre = 0;
        while (num != 0){
            int rem = num % 10;
            if(rem == dig)
                fre++;

            num /= 10;
        }
        return fre;
    }
}
