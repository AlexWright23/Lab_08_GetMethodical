import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get UserName
        System.out.println("PGet User Name");
        GetUserName.main(args);
        System.out.println("\n-----------------------------\n");

        // Favorite Numbers
        System.out.println("Favorite Numbers");
        FavNumbers.main(args);
        System.out.println("\n-----------------------------\n");

        // Date and Time of Birth
        System.out.println("Date and Time of Birth");
        BirthDateTime.main(args);
        System.out.println("\n-----------------------------\n");

        // Check Out at the 10$ Store
        System.out.println("Check Out at the 10$ Store");
        CheckOut.main(args);
        System.out.println("\n-----------------------------\n");

        // RegEx is Magic
        System.out.println("RegEx is Magic");
        Reggie.main(args);
        System.out.println("\n-----------------------------\n");

        // Pretty Header
        System.out.println("Pretty Header");
        PrettyHeader.main(args);
        System.out.println("\n-----------------------------\n");

        //  C to F Table Display
        System.out.println("C to F Table Display");
        CtoFTableDisplay.main(args);
    }
}
