package zajecia4.zadanie3;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 9);
        Point p3 = new Point(0, 7);
        Point p4 = new Point(1, 2);
        Section s1 = new Section(p1, p2);
//        System.out.println(Check.getSectionLength(s1));
//        System.out.println(Check.isTriangleBuilt(p1, p2, p3));
        System.out.println(Check.isTriangleBuilt(p1, p2, p3));

    }
}
