import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2)
            System.out.println(num1 + " is the largest number");
        else
            System.out.println(num2 + " is the largest number");

    }
}
