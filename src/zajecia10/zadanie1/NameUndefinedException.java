package zajecia10.zadanie1;

public class NameUndefinedException extends Exception {
    public NameUndefinedException() {
        super("Provided string is null or its length is less than 2 characters");
    }
}
