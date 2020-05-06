package zajecia9.zadanie2;

public abstract class Vehicle implements Moveable {
    String name;
    int year;
    String direction;

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
