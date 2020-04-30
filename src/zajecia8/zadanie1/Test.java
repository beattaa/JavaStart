package zajecia8.zadanie1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Dog[] dogTab = new Dog[3];
        for (int i = 0; i < dogTab.length; ) {
            Dog dog = getDog();
            if (checkIfDogNotExists(dogTab, dog, i)) {
                dogTab[i] = dog;
                System.out.println((i + 1) + ". pies dodany");
                i++;
            }
        }
        System.out.println("Wszystkie psy dodane");
    }

    public static Dog getDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie psa: ");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek psa: ");
        int age = scanner.nextInt();
        return new Dog(name, age);
    }

    public static boolean checkIfDogNotExists(Dog[] tab, Dog dog, int j) {
        for (int i = 0; i < j; i++) {
            if (tab[i].equals(dog)) {
                System.out.println("Ten pies juz jest");
                return false;
            }
        }
        return true;
    }
}


