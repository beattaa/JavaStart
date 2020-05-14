package zajecia10.zadanie3;

public class DuplicateException extends RuntimeException {
    public DuplicateException() {
        super("This value already exists");
    }
}
