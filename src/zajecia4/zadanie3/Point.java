package zajecia4.zadanie3;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isInTheFirstQuarter(Point p) {
        return p.getX() > 0.00 & p.getY() > 0.00;
    }

    public boolean isInTheSecondQuarter(Point p) {
        return p.getX() < 0.00 & p.getY() > 0.00;
    }

    public boolean isInTheThirdQuarter(Point p) {
        return p.getX() < 0.00 & p.getY() < 0.00;
    }

    public boolean isInTheFourthQuarter(Point p) {
        return p.getX() > 0.00 & p.getY() < 0.00;
    }

    public boolean isLaidOnAxisX(Point p) {
        return p.getX() == 0.00 & p.getY() != 0.00;
    }

    public boolean isLaidOnAxisY(Point p) {
        return p.getX() != 0.00 & p.getY() == 0.00;
    }

    public boolean isLaidInTheMiddle(Point p) {
        return p.getX() == 0.00 & p.getY() == 0.00;
    }
}
