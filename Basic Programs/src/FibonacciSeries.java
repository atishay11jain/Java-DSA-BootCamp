import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int term = sc.nextInt();

        fibSeries(term);
    }

    public static void fibSeries(int term){
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < term; i++) {
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b = sum;
        }

    }
}
