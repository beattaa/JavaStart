package zajecia9.zadanie2.Vehicles;

import zajecia9.zadanie2.Directions;

public abstract class Vehicle implements Moveable {
    public String name;
    public int year;
    public Directions direction;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void turnLeft() {
        direction = Directions.LEFT;
    }

    public void turnRight() {
        direction = Directions.RIGHT;
    }

    public void goForward() {
        direction = Directions.FORWARD;
    }

    public void goBack() {
        direction = Directions.BACK;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Directions getDirection() {
        return direction;
    }
}
