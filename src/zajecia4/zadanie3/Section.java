package zajecia4.zadanie3;

public class Section {
    private final Point startPoint;
    private final Point endPoint;
    private final double a;
    private final double b;

    public Section(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.a = endPoint.getX() - startPoint.getX();
        this.b = endPoint.getY() - startPoint.getY();
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getSectionLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }
}
