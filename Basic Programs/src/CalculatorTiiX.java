import java.util.Scanner;

public class CalculatorTiiX {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int ans = 0;

        while (true){
            System.out.print("Please Enter A operator : ");
            char op = sc.next().charAt(0);
            System.out.print("Enter two numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(op == '+'){
               ans = num1+num2;
            }else if(op == '-'){
                ans = num1-num2;
            }else if (op == '*'){
                ans = num1 * num2;
            }else if (op == '/'){
                if(num2 != 0)
                ans = num1 / num2;
            }else if(op == '%'){
                ans = num1 % num2;
            }
            else  if (op == 'X' || op == 'x'){
                System.out.println("111");
                break;
            }
            else {
                System.out.println("Please Input A valid operator : ");
            }
            System.out.println(ans);
        }
    }
}
