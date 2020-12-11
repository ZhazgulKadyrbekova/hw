public class Main {
    public static void main(String[] args) {
        Continent australia = new Continent();
        australia.setCountryNumber(1);
        System.out.println(australia.getName());
        System.out.println(australia.getCountryNumber());
        System.out.println();

        Country australia1 = new Country();
        australia1.setPopulation(192000);
        System.out.println(australia1.getName());
        System.out.println(australia1.getPopulation());

    }
}
