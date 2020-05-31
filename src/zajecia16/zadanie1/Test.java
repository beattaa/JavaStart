package zajecia16.zadanie1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String seasonPolishName = getSeasonPolishName();
        Season matchedSeason = findSeasonWithGivenPolishName(seasonPolishName);
        System.out.println(seasonPolishName + " wystepuje w  " + matchedSeason.getMonths());

    }

    public static Season findSeasonWithGivenPolishName(String seasonPolishName) {
        Season matchedSeason = null;

        for (Season value : Season.values()) {
            if (value.getName().equalsIgnoreCase(seasonPolishName)) {
                matchedSeason = value;
                break;
            }
        }
        return matchedSeason;
    }

    public static String getSeasonPolishName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pory roku (po polsku)");
        return scanner.nextLine();
    }
}
