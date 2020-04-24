package zajecia7.zadanie1;

public class Test {
    public static void main(String[] args) {
        Truck myTruck = new Truck("MAN", 300, 30);
        System.out.println(myTruck.getAverageMilage());
        System.out.println(myTruck.getFuelConsumption());
        myTruck.setLoad(100);
        System.out.println(myTruck.getAverageMilage());
        System.out.println(myTruck.getFuelConsumption());
        myTruck.turnOnAirCondition();
        System.out.println(myTruck.getAverageMilage());
        System.out.println(myTruck.getFuelConsumption());


    }
}
