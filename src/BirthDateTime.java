import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int birthDay = getValidDay(in, birthMonth);

        int birthHours = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);

        int birthMinutes = SafeInput.getRangedInt(in, "Enter the minutes of your birth", 1, 59);

        System.out.println("Your birth date and time: " + birthYear + "-"
                + (birthMonth < 10 ? "0" : "") + birthMonth + "-"
                + (birthDay < 10 ? "0" : "") + birthDay + " "
                + (birthHours < 10 ? "0" : "") + birthHours + ":"
                + (birthMinutes < 10 ? "0" : "") + birthMinutes);
    }

    private static int getValidDay(Scanner in, int month) {
        int maxDay;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
            default:
                maxDay = 31;
        }

        int day;
        do {
            day = SafeInput.getRangedInt(in, "Please enter the day of your birth", 1, maxDay);
        } while (day > maxDay);

        return day;
    }
}
