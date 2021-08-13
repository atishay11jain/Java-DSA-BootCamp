import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int ans = largest(num1,num2,num3);
        System.out.println(ans + " is the largest number");
    }

    public static int largest(int num1,int num2,int num3){
//        int ans = (num1>num2)? ((num1>num3)? num1:num3) : ((num2>num3)? num2:num3);
//        return ans;

        int max = num1;
        if(num2 > max)
            max = num2;
        if(num3 > max)
            max = num3;

        return max;
    }
}
