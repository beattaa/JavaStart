package zajecia16.zadanie2;

public class Card {
    Figure figure;
    Colour colour;

    public Card(Figure figure, Colour colour) {
        this.figure = figure;
        this.colour = colour;
    }

    public String toStringPolish() {
        return figure.getPolishName() + " " + colour.getPolishName();
    }

    public String toStringEnglish() {
        return figure.getEnglishName() + " " + colour.getEnglishName();
    }
}
