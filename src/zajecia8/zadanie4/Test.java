package zajecia8.zadanie4;

public class Test {
    public static void main(String[] args) {

        BasicAirConditioner basicAirConditioner = new BasicAirConditioner();
        Room livingRoom = new Room(18.4, 10);

        livingRoom.setAirConditioner(basicAirConditioner);
        livingRoom.fireAirConditioner();
        System.out.println(livingRoom.getTemperature());

        System.out.println("--------------------------");

        ProAirConditioner proAirConditioner = new ProAirConditioner();
        Room sleepingRoom = new Room(16.6, 9);
        sleepingRoom.setAirConditioner(proAirConditioner);

        sleepingRoom.fireAirConditioner();
        System.out.println(sleepingRoom.getTemperature());

        sleepingRoom.fireAirConditioner();
        System.out.println(sleepingRoom.getTemperature());

        sleepingRoom.fireAirConditioner();
        System.out.println(sleepingRoom.getTemperature());
    }
}
