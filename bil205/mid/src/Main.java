public class Main {
    public static void main(String[] arg) {
        Automobile automobile = new Automobile("green", 12, 2020);
        automobile.move();
        automobile.move("right");
        System.out.println();

        Car car = new Car("red", 13, 2019, 5);
        car.move();
        System.out.println();

        Truck truck = new Truck("blue", 14, 2018, "carry luggage");
        truck.move();
        System.out.println();
    }
}
