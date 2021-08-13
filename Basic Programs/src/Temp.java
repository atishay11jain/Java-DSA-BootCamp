import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String val = sc.next();
        int ans = 0;
        while (!(val.equals("X")) && !(val.equals("x"))){
            ans += Integer.parseInt(val);
            val = sc.next();
        }

        System.out.println(ans);
    }
}
