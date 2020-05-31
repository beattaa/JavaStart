package zajecia16.zadanie2;

public enum Colour {
    Trefl("żołądź", "clubs"),
    Karo("dzwonek", "diamonds"),
    Kier("serce", "hearts"),
    Pik("wino", "spades");

    private final String polishName;
    private final String englishName;

    Colour(String polishName, String englishName) {
        this.polishName = polishName;
        this.englishName = englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
