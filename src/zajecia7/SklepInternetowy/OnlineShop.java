package zajecia7.SklepInternetowy;

public class OnlineShop {
    public static void main(String[] args) {
        Address customerAddress = new Address("Wrocław", "Kościuszki", "32A", "2");
        Customer customer = new Customer("Jan", "Kowalski", customerAddress, 5000);
        Employee employee = new Employee("Anna", "Wiśniewska", customerAddress, 4000);
        Director director = new Director("Stefan", "Nowak", customerAddress, 8000);
        director.setBonus(3000);
        System.out.println(customer.printInfo());
        System.out.println(employee.printInfo());
        System.out.println(director.printInfo());
    }
}
