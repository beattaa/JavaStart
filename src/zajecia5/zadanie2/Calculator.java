package zajecia5.zadanie2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby całkowite");
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        compare(a, b);
    }

    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + b);
        } else if (a < b) {
            System.out.println(a * b);
        } else {
            System.out.println(Math.pow(a, 2) + " " + Math.pow(b, 2));
        }
    }
}
