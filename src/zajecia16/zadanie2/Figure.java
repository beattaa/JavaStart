package zajecia16.zadanie2;

public enum Figure {
    DWOJKA("dwójka", "Two of"),
    TROJKA("trójka ", "Three of "),
    CZWORKA("czwórka ", "Four of "),
    PIATKA("piatka", "Five of"),
    SZOSTKA("szóstka", "Six of "),
    SIODEMKA("siódemka", "Seven of "),
    OSEMKA("ósemka", "Eight of "),
    DZIEWIATKA("dziewiątka", "Nine of "),
    DZIESIATKA("dziesiątka", "Ten of "),
    WALET("walet", "jack"),
    DAMA("dama", "queen"),
    KROL("król", "king"),
    AS("as", "ace");

    private final String polishName;
    private final String englishName;

    Figure(String polishName, String englishName) {
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
