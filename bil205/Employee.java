public class Employee {
    String name, surname;
    int age;
    String status;
    int salary;
    int experience;

    public Employee() {
    }

    public Employee(String name, String surname, int age, String status, int salary, int experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.status = status;
        this.salary = salary;
        this.experience = experience;
    }

    void work(){
        System.out.println(this.name + " is working.");
    }

    void rest(){
        System.out.println(this.name + " is having a rest.");
    }

    void rest(int min){
        System.out.println(this.name + " is having a rest for " + min + " minutes.");
    }

    void rest(int h, int min){
        System.out.println(this.name + " is having a rest for " + h + " hours and " + min + " minutes.");
    }

    void info(){
        System.out.println("\tInfo:" +
                "\nName: " +this.name +
                "\nSurname: " + this.surname +
                "\nAge: " + this.age +
                "\nStatus: " + this.status + 
                "\nSalary: " + this.salary + 
                "\nTotal experience: " + this.experience);
    }
}
