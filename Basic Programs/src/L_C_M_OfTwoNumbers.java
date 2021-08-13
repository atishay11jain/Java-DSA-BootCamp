import java.util.Scanner;

public class L_C_M_OfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = lcm(num1, num2);
        System.out.println(ans);
    }

    public static int lcm(int num1,int num2){
        int max_val = Math.max(num1,num2);

        if(max_val % num1 == 0 && max_val % num2 == 0)
            return max_val;
        else{
            for (int i = max_val; i <= Integer.MAX_VALUE; i++) {
                if (i % num1 == 0 && i % num2 == 0)
                    return i;
            }
        }
        return -1;
    }


}
