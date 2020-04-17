package zajecia5.zadanie1;

import java.util.Scanner;

public class TableSum {
    public static void main(String[] args) {
        int[] intTable = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 liczb calkowitych");
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbę: ");
            intTable[i] = scanner.nextInt();
        }
        System.out.println(intTable[0] + intTable[2] + intTable[4]);
    }
}
