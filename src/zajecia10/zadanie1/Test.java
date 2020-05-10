package zajecia10.zadanie1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = null;
        String firstName;
        String lastName;
        int age;
        String pesel;

        System.out.print("Podaj imie: ");
        firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        lastName = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        age = scanner.nextInt();
        System.out.print("Podaj pesel: ");
        pesel = scanner.next();

        try {
            person = new Person(firstName, lastName, age, pesel);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(person.toString());
        } catch (NullPointerException e) {
            System.err.println("Person has not been created");
        }

    }

}
