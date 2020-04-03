package zajecia2;

public class Logics {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 7;

        System.out.println(x > y || y < 2);
        System.out.println(x > y && x > z);
        System.out.println(x + y >= z);
        System.out.println(y - z < x);
        System.out.println(x * y != z);
        System.out.println(x * y > x / z);
    }
}
