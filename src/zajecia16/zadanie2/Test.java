package zajecia16.zadanie2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Card> cards = getPackOfCards();
        Language chosenLanguage = getLanguage();
        printPackOfCards(cards, chosenLanguage);
    }

    public static void printPackOfCards(List<Card> cards, Language chosenLanguage) {
        if (chosenLanguage == Language.EN) {
            for (Card card : cards) {
                System.out.println(card.toStringEnglish());
            }
        } else if (chosenLanguage == Language.PL) {
            for (Card card : cards) {
                System.out.println(card.toStringPolish());
            }
        }
    }

    public static Language getLanguage() {
        String chosenLanguage;
        Language language;
        do {
            System.out.println("Podaj język, dostepne to: " + Arrays.toString(Language.values()));
            Scanner scanner = new Scanner(System.in);
            chosenLanguage = scanner.nextLine();
            language = Language.findByName(chosenLanguage);

        }
        while (!Arrays.asList(Language.values()).contains(language));
        return language;
    }

    public static List<Card> getPackOfCards() {
        List<Card> cards = new ArrayList<>();
        for (Colour value : Colour.values()) {
            for (Figure figure : Figure.values()) {
                cards.add(new Card(figure, value));
            }
        }
        return cards;
    }

}
