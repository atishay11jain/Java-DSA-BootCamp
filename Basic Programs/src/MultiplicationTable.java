import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        table(num);
    }

    public  static void table(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num +" * "+i+" = " + num*i);
        }
    }
}
