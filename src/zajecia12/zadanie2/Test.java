package zajecia12.zadanie2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String, Country> countriesMap = createCountriesMap("plik.csv");
        System.out.println(countriesMap);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kod kraju: ");
        String countryCode = scanner.next().toUpperCase();
        Country country = countriesMap.get(countryCode);
        if (country != null) {
            System.out.println(countriesMap.get(countryCode));
        } else {
            System.out.println("Nie ma danych na temat tego państwa");
        }
    }

    public static Map<String, Country> createCountriesMap(String fileName) {
        Map<String, Country> countriesMap = new HashMap<>();
        List<String> countriesLines = getCountriesData(fileName);
        for (int i = 0; i < countriesLines.size(); i++) {
            String[] splitLine = countriesLines.get(i).split(";");
            Integer population = Integer.valueOf(splitLine[2]);
            Country country = new Country(splitLine[0], splitLine[1], population);
            countriesMap.put(splitLine[0], country);
        }
        return countriesMap;
    }

    public static List<String> getCountriesData(String fileName) {
        List<String> countriesLines = null;
        try {
            countriesLines = Files.readAllLines(Paths.get("src/zajecia12/zadanie2/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countriesLines;
    }
}
