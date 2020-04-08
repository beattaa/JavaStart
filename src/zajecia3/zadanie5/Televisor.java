package zajecia3.zadanie5;

public class Televisor {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("TV is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is off");
    }

    public void showStatus() {
        if (isOn)
            System.out.println("Current status: TV is on");
        else
            System.out.println("Current status: TV is off");
    }

}
