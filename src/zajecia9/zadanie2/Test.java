package zajecia9.zadanie2;

import zajecia9.zadanie2.Rent.RentableCar;

public class Test {
    public static void main(String[] args) {
        RentableCar rc1 = new RentableCar("Ford Mustang", 1978, 4);
        RentableCar rc2 = new RentableCar("Nissan GTR", 2010, 5);
        RentableCar[] carsToRent = new RentableCar[]{rc1, rc2};
        for (RentableCar re : carsToRent) {
            re.rent("Jan", "Kowalski", "1");
        }
        System.out.println(carsToRent[1].toString());
        System.out.println(carsToRent[1].isRent());
        carsToRent[1].handOver();
        System.out.println(carsToRent[1].toString());
        System.out.println(carsToRent[1].isRent());

    }
}
