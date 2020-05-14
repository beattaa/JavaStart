package zajecia10.zadanie1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();
        System.out.print("Podaj pesel: ");
        String pesel = scanner.next();

        try {
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person.toString());

        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }


    }

}
