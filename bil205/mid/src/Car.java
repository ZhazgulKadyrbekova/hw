public class Car extends Automobile{
    private int maxPersons;

    public Car() {
    }

    public Car(String color, int maxWeight, int year, int maxPersons) {
        super(color, maxWeight, year);
        this.maxPersons = maxPersons;
    }

    public void move() {
        System.out.println("Car is moving to left");
    }

    /****************************** GETTERS & SETTERS   ********************/

    public int getMaxPersons() {
        return maxPersons;
    }

    public void setMaxPersons(int maxPersons) {
        this.maxPersons = maxPersons;
    }


}
