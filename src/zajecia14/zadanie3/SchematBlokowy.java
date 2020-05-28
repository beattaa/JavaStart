package zajecia14.zadanie3;

import java.util.Scanner;

//Program sumuje liczby, ktorych kwadraty sa mniejsze od 100, a nastepnie bierze z tej sumy reszte z dzielenia przez 2
public class SchematBlokowy {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (Math.pow(x, 2) < 100) {
            sum += x;
            System.out.print("Podaj x= ");
            x = scanner.nextInt();
        }
        sum = sum % 2;
        System.out.println("Sum= " + sum);
    }
}
