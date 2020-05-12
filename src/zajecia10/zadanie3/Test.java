package zajecia10.zadanie3;

public class Test {
    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder();
        namesHolder.add("Beata");
        namesHolder.add("Ola");
        namesHolder.add("Ala");

        try {
            namesHolder.add("beata");
        } catch (NullPointerException | DuplicateException e) {
            System.out.println(e.getMessage());
        }

        try {
            namesHolder.remove("Ala");
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(namesHolder);
    }
}
