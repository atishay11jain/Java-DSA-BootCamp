import java.util.Scanner;

public class InputTill0FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max_val = Integer.MIN_VALUE;
        while (num != 0){
            max_val = Math.max(max_val,num);
            num = sc.nextInt();
        }
        System.out.println(max_val);
    }
}
