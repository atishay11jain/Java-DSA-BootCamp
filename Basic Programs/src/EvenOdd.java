import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(evenOdd(num)){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }

    public static boolean evenOdd(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }
}
