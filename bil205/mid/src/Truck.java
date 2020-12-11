public class Truck extends Automobile{
    private String purpose;

    public Truck() {
    }

    public Truck(String color, int maxWeight, int year, String purpose) {
        super(color, maxWeight, year);
        this.purpose = purpose;
    }

    public void move() {
        System.out.println("Truck is moving to left");
    }

    /****************************** GETTERS & SETTERS   ********************/

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }


}
