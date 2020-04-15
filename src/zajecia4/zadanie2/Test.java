package zajecia4.zadanie2;

public class Test {
    public static void main(String[] args) {
        Room room1 = new Room(35.5, 17, true);
        room1.decreaseTemp();
        room1.decreaseTemp();
        room1.decreaseTemp();
        room1.decreaseTemp();
        room1.decreaseTemp();
        room1.decreaseTemp();

        System.out.println(room1.getTemperature());
    }
}
