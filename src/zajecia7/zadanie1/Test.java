package zajecia7.zadanie1;

public class Test {
    public static void main(String[] args) {
        Truck myTruck = new Truck("MAN", 300, 30);
        System.out.println("--- Test for truck ---");
        System.out.println(myTruck.getAverageMilage());
        System.out.println(myTruck.getFuelConsumption());
        myTruck.setLoad(100);
        System.out.println(myTruck.getAverageMilage());
        System.out.println(myTruck.getFuelConsumption());
        myTruck.turnOnAirCondition();
        System.out.println(myTruck.getAverageMilage());
        System.out.println(myTruck.getFuelConsumption());

        System.out.println("****************");

        Car citroenC3 = new Car("Citroen C3", 40, 7.5);
        Car hondaCivic = new Car("Honda Civic", 32, 8.5);
        Truck myTruck2 = new Truck("MAN", 150, 30);
        Car[] carTable = {citroenC3, hondaCivic, myTruck2};

        for (Vehicle vehicle : carTable) {
            System.out.println(vehicle.getName());
            System.out.println(vehicle.getFuelConsumption());
            System.out.println(vehicle.getAverageMilage());
        }

        for (Car car : carTable) {
            car.turnOnAirCondition();
        }

        System.out.println("---------------------");

        for (Vehicle vehicle : carTable) {
            System.out.println(vehicle.getName());
            System.out.println(vehicle.getFuelConsumption());
            System.out.println(vehicle.getAverageMilage());
        }

    }
}
