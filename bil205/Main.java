public class Main {
    public static void main(String[] args) {
        Employee esen = new Employee("Esen", "Asanov", 27, "developer", 1500, 3);

        esen.info();
        System.out.println();
        

        Manager asan = new Manager("Asan", "Esenov", 32, "manager", 1200, 7, "amazon", "MobDev", 3);

        asan.info();
    }
}
