import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numToExamine = 2;
        int baseNum = 2;
        int modResult = 0;
        System.out.println("Enter your number");
            numToExamine = in.nextInt();
        modResult = numToExamine % baseNum;
            if (modResult == 0) {
                System.out.println("The mod is Even!");
            } else if (modResult == 1) {
                System.out.println("the mod is Odd!");
            }
    }
}