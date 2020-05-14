package zajecia10.zadanie1;

public class IncorrectAgeException extends Exception {
    IncorrectAgeException() {
        super("Provided age is less than 1");
    }
}
