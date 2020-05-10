package zajecia10.zadanie3;

public class DuplicateException extends RuntimeException {
    public DuplicateException() {
        System.err.println("This value already exists");
    }
}
