package zajecia4.zadanie1;

public class Check {
    public static boolean isRightTriangle(Triangle triangle) {
        return Math.pow(triangle.getEdgeA(), 2) + Math.pow(triangle.getEdgeB(), 2) == Math.pow(triangle.getEdgeC(), 2);
    }
}
