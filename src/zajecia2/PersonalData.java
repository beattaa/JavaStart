package zajecia2;

public class PersonalData {
    public static void main(String[] args) {

        String name = "Jan";
        String surname = "Kowalski";
        int age = 25;
        double height = 180.5;
        double heightGrowth = 5.0;

        System.out.println(name + " " + surname + " ma " + age + " lat");
        System.out.println(name + " " + surname + " ma pesel 9508097867");
        System.out.println(name + " " + surname + " ma " + height + " cm wzrostu");
        System.out.println("Jezeli " + name + " urosnie " + heightGrowth + "cm, to bedzie mial " + (height + heightGrowth) + "cm wzrostu");
    }
}
