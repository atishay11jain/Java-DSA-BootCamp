import java.util.Scanner;



public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yr = sc.nextInt();

        boolean ans = checkLeap(yr);
        if(ans)
            System.out.println("Given year is a leap year");
        else
            System.out.println("Given year is not a leap year");
    }

    public static boolean checkLeap(int yr){
        if((yr % 400 == 0) || (yr % 4 == 0 && yr %100 != 0))
            return true;

        return false;
    }
}
