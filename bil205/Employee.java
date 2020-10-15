public class Employee {
    String name, surname;
    int age;
    String status;
    int salary;
    int experience;

    void work(){
        System.out.println(this.name + " is working.");
    }

    /////////////////////////////////    EXAMPLE FOR OVERLOADING     ///////////////////////////////////////
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
