package zajecia9.zadanie2.Rent;

public interface Rentable {
    void rent(String firstName, String lastName, String id);

    void handOver();

    boolean isRent();

}
