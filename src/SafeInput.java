import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int intValue = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                intValue = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid input.");
                pipe.nextLine();
            }
        } while (!validInput);

        return intValue;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double doubleValue = 0.0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                doubleValue = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid input.");
                pipe.nextLine();
            }
        } while (!validInput);

        return doubleValue;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int intValue;
        do {
            intValue = getInt(pipe, prompt + " [" + low + " - " + high + "]");
        } while (intValue < low || intValue > high);
        return intValue;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double doubleValue;
        do {
            doubleValue = getDouble(pipe, prompt + " [" + low + " - " + high + "]");
        } while (doubleValue < low || doubleValue > high);
        return doubleValue;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean isYes;
        String response;
        do {
            response = getNonZeroLenString(pipe, prompt + " [Y/N]").toUpperCase();
        } while (!(response.equals("Y") || response.equals("N")));

        isYes = response.equals("Y");
        return isYes;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            input = getNonZeroLenString(pipe, prompt);
        } while (!input.matches(regEx));
        return input;
    }

        public static void prettyHeader(String msg) {
            int totalWidth = 60;
            int msgLength = msg.length();

            printStars(totalWidth);

            // Print the second row with centered message
            System.out.print("***");
            printSpaces((totalWidth - 6 - msgLength) / 2); // Calculate spaces before the message
            System.out.print(msg);
            printSpaces((totalWidth - 6 - msgLength) / 2); // Calculate spaces after the message
            System.out.println("***");


            printStars(totalWidth);
        }

        private static void printStars(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        private static void printSpaces(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(" ");
            }
        }
    }

