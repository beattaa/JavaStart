package zajecia6.zadanie4;

public class ConverterTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " day of the week is " + CalendarConverter.convertDayToString(i));
        }
    }
}
