package zajecia8.zadanie4;

public class BasicAirConditioner extends AirConditioner {
    public static final double TARGET_TEMPERATURE = 18.00;
    public static double POWER = 1.00;

    public void fireAirConditioner(Room room) {
        if (room.getTemperature() > TARGET_TEMPERATURE + POWER / room.getCubage()) {
            double newTemp = room.getTemperature() - POWER / room.getCubage();
            room.setTemperature(newTemp);
        }
    }
}
