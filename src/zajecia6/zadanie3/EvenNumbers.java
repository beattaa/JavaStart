package zajecia6.zadanie3;

public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 102; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Suma liczb parzystych z zakresu <0,100> to: " + sum);
    }
}
