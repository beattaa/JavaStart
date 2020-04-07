package zajecia3;

public class Producer {
    public String name;
    public Address address;

    public Producer(String name) {
        this.name = name;
    }

    public void addAddress(Address address) {
        this.address = address;
    }
}
