import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + ssn);

        String studentId = SafeInput.getRegExString(in, "Enter your UC Student M number (format: Mxxxxx)", "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M number: " + studentId);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [OoSsVvQq]", "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);

        System.out.println("Thank you!");

        in.close();
    }
}






