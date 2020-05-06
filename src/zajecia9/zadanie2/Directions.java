package zajecia9.zadanie2;

public enum Directions {
    LEFT("Left"),
    RIGHT("Right"),
    FORWARD("Forward"),
    BACK("Back");

    String value;

    Directions(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
