public class Employee {
    protected String name, surname;
    protected int age;
    protected String status;
    protected int salary;
    protected int experience;

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

    /////////////////   getters & setters   /////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    /////////////////////////   class methods   ///////////////////////////

    public void work(){
        System.out.println(this.name + " is working.");
    }

    public void rest(){
        System.out.println(this.name + " is having a rest.");
    }

    public void rest(int min){
        System.out.println(this.name + " is having a rest for " + min + " minutes.");
    }

    public void rest(int h, int min){
        System.out.println(this.name + " is having a rest for " + h + " hours and " + min + " minutes.");
    }

    public void info(){
        System.out.println("\tInfo:" +
                "\nName: " +this.name +
                "\nSurname: " + this.surname +
                "\nAge: " + this.age +
                "\nStatus: " + this.status + 
                "\nSalary: " + this.salary + 
                "\nTotal experience: " + this.experience);
    }
}
