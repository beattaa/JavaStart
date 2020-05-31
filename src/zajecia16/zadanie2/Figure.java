package zajecia16.zadanie2;

public enum Figure {
    _2("dwójka", "Two of"),
    _3("trójka ", "Three of "),
    _4("czwórka ", "Four of "),
    _5("piatka", "Five of"),
    _6("szóstka", "Six of "),
    _7("siódemka", "Seven of "),
    _8("ósemka", "Eight of "),
    _9("dziewiątka", "Nine of "),
    _10("dziesiątka", "Ten of "),
    walet("walet", "jack"),
    dama("dama", "queen"),
    król("król", "king"),
    as("as", "ace");

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
