package zajecia9.zadanie2.Vehicles;

import zajecia9.zadanie2.Directions;
import zajecia9.zadanie2.Vehicles.Moveable;

public abstract class Vehicle implements Moveable {
    public String name;
    public int year;
    public String direction;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void turnLeft() {
        direction = Directions.LEFT.getValue();
    }

    public void turnRight() {
        direction = Directions.RIGHT.getValue();
    }

    public void goForward() {
        direction = Directions.FORWARD.getValue();
    }

    public void goBack() {
        direction = Directions.BACK.getValue();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirection() {
        return direction;
    }
}
