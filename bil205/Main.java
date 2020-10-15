public class Main {
    public static void main(String[] args) {
        Employee asan = new Employee();

        asan.name = "Asan";
        asan.surname = "Esenov";
        asan.age = 27;
        asan.status = "developer";
        asan.salary = 1500;
        asan.experience = 3;

        asan.work();
        asan.rest();
        asan.rest(20);
        asan.rest(2, 15);

        asan.info();

        System.out.println();
        

        Manager uson = new Manager();

        uson.name = "Uson";
        uson.surname = "Esenov";
        uson.age = 32;
        uson.status = "manager";
        uson.salary = 1200;
        uson.experience = 7;
        uson.company = "amazon";
        uson.department = "MobDev";
        uson.experienceInDepartment = 3;

        uson.work();
        uson.rest();
        uson.control();

        uson.info();
    }
}
