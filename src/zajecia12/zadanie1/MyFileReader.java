package zajecia12.zadanie1;

import zajecia11.zadanie1.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {

    public static List<Integer> getListOfNumbers(File file) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[\r\n]");

        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

}
