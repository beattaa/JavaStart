package zajecia8.zadanie5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String header;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj ciag stringow: ");
            header = scanner.nextLine();
            if (arrayList.contains(header)) {
                System.out.println("Ten ciag znakow juz wystapil. Koniec programu.");
                return;
            }
            arrayList.add(header);
        } while (true);
    }
}
