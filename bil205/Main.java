public class Main {
    public static void main(String[] args) {
        Employee asan = new Employee();

        asan.name = "Asan";
        asan.surname = "Esenov";
        asan.age = 27;
        asan.status = "manager";

        asan.info();

        asan.work();
        asan.rest();
    }
}
