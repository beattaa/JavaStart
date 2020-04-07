package zajecia3.zadanie1;

public class Mug {
    String colour;
    boolean isEmpty;
    double radius;

    public Mug(String colour, boolean isEmpty, double radius) {
        this.colour = colour;
        this.isEmpty = isEmpty;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "colour='" + colour + '\'' +
                ", isEmpty=" + isEmpty +
                ", radius=" + radius +
                '}';
    }
}
