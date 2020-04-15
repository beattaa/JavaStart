package zajecia4.zadanie1;

import java.util.Arrays;

public class Triangle {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(double a, double b, double c) {
        double[] edges = Arrays.stream(new double[]{a, b, c}).sorted().toArray();
        this.edgeA = edges[0];
        this.edgeB = edges[1];
        this.edgeC = edges[2];
    }

    public double getEdgeA() {
        return edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }
}
