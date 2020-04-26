package zajecia4.zadanie3;

public class Check {
    public static double getSectionLength(Section section) {
        return Math.sqrt(Math.pow(section.getEndPoint().getX() - section.getStartPoint().getX(), 2) + Math.pow(section.getEndPoint().getY() - section.getStartPoint().getY(), 2));
    }

    public static boolean isTriangleBuilt(Point p1, Point p2, Point p3) {
        Section s1 = new Section(p1, p2);
        Section s2 = new Section(p1, p3);
        double k1 = 0.00;
        double k2 = 0.00;
        if (s1.getA() != 0.00) {
            k1 = s2.getA() / s1.getA();
        }
        if (s1.getB() != 0.00) {
            k2 = s2.getB() / s1.getB();
        }
        return k1 != k2;
    }
}
