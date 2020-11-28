public class Main {
    public static void main(String[] args) {
        Transport auto = new Automobile();
        Transport plane = new Plane();
        Transport ship = new Ship();
        Transport bike = new Bicycle();

        System.out.print("Automobile:\t");
        auto.move();
        System.out.print("Plane:\t");
        plane.move();
        System.out.print("Ship:\t");
        ship.move();
        System.out.print("Bicycle:\t");
        bike.move();
    }
}
