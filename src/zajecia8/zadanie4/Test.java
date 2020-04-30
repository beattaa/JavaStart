package zajecia8.zadanie4;

public class Test {
    public static void main(String[] args) {
        Room livingRoom = new Room(18.4, 10);
        BasicAirConditioner basicAirConditioner = new BasicAirConditioner();
        livingRoom.setAirConditioner(basicAirConditioner);

        basicAirConditioner.fireAirConditioner(livingRoom);
        System.out.println(livingRoom.getTemperature());

        basicAirConditioner.fireAirConditioner(livingRoom);
        System.out.println(livingRoom.getTemperature());

        basicAirConditioner.fireAirConditioner(livingRoom);
        System.out.println(livingRoom.getTemperature());

        basicAirConditioner.fireAirConditioner(livingRoom);
        System.out.println(livingRoom.getTemperature());

        basicAirConditioner.fireAirConditioner(livingRoom);
        System.out.println(livingRoom.getTemperature());

        System.out.println("--------------------------");
        ProAirConditioner proAirConditioner = new ProAirConditioner();
        Room sleepingRoom = new Room(16.6, 9);
        sleepingRoom.setAirConditioner(proAirConditioner);

        proAirConditioner.fireAirConditioner(sleepingRoom);
        System.out.println(sleepingRoom.getTemperature());

        proAirConditioner.fireAirConditioner(sleepingRoom);
        System.out.println(sleepingRoom.getTemperature());

        proAirConditioner.fireAirConditioner(sleepingRoom);
        System.out.println(sleepingRoom.getTemperature());
    }
}
