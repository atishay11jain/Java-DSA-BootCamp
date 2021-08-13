import java.util.Scanner;

public class UppercaseOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

            upperOrLower(ch);
    }

    public static void upperOrLower(char ch){

        if(ch >= 'a' && ch <= 'z')
            System.out.println("Given character is in LowerCase");
        else if(ch >= 'A' && ch <= 'Z')
            System.out.println("Given character is in UpperCase");
        else
            System.out.println("Input is invalid");
    }
}
