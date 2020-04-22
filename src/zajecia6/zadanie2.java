package zajecia6;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbe: ");
            suma += scanner.nextInt();
        }
        System.out.println("Suma to: " + suma);
    }
}
