public class Employee {
    String name, surname;
    int age;
    String status;
    int salary;
    int experience;

    void work(){
        System.out.println(this.name + " is working.");
    }

    void rest(){
        System.out.println(this.name + " is having a rest.");
    }

    void info(){
        System.out.println("Name: " +this.name +
                "\nSurname: " + this.surname +
                "\nAge: " + this.age +
                "\nStatus: " + this.status + 
                "\nSalary: " + this.salary + 
                "\nTotal experience: " + this.experience);
    }
}
