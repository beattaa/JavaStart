package zajecia12.zadanie1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("src/zajecia12/zadanie1/plik.txt");
        List<Integer> numbers = null;
        Map<Integer, Integer> counters = new HashMap<>();

        try {
            numbers = MyFileReader.getListOfNumbers(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set<Integer> noDuplicatedNumbers = new HashSet<>(numbers);

        Collections.sort(numbers);

        Iterator<Integer> it = noDuplicatedNumbers.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            int counter = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == next) {
                    counter++;
                }
            }
            counters.put(next, counter);
        }
        for (Map.Entry<Integer, Integer> entry : counters.entrySet())
            System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());
    }
}
