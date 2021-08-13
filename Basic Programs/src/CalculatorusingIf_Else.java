import java.util.Scanner;

public class CalculatorusingIf_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        char op = sc.next().charAt(0);

        operation(num1, num2, op);

    }

    public static void operation(double num1, double num2, char op) {

        if (op == '+')
            System.out.println(num1 + num2);
        else if (op == '-')
            System.out.println(num1 - num2);
        else if (op == '*')
            System.out.println(num1 * num2);
        else if (op == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Given operator is invalid");

    }

}
