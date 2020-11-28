public class Automobile {
    private String color;
    private int maxWeight;
    private int year;

    public Automobile() {
    }

    public Automobile(String color, int maxWeight, int year) {
        this.color = color;
        this.maxWeight = maxWeight;
        this.year = year;
    }

    public void move() {
        System.out.println("Automobile is moving to left");
    }

    public void move(String direction) {
        System.out.println("Automobile is moving to " + direction);
    }

    /****************************** GETTERS & SETTERS   ********************/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
