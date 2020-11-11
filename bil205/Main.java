public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Doe", 27, "developer", 3);

        john.info();
        john.work();
        System.out.println();
        

        Manager sam = new Manager("Sam", "Smith", 32, "manager", 7, "MobDev", 3);

        sam.info();
        sam.work();
    }
}
