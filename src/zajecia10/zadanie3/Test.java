package zajecia10.zadanie3;

public class Test {
    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder();
        namesHolder.list.add("Beata");
        namesHolder.list.add("Ada");
        namesHolder.list.add("Ola");
        String name1 = "beata";

        try {
            namesHolder.add(name1);
        } catch (NullPointerException | DuplicateException e) {
            System.out.println(e.getMessage());
        }

        try {
            namesHolder.remove("ola");
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
