public class Employee {
    protected String name, surname;
    protected int age;
    protected String status;
    protected int salary;
    protected int experience;
    private static String employer;

    public Employee() {
    }

    public Employee(String name, String surname, int age, String status, int salary, int experience) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setStatus(status);
        this.setSalary(salary);
        this.setExperience(experience);
    }

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

    public static String getEmployer() {
        return employer;
    }

    public static void setEmployer(String employer) {
        Employee.employer = employer;
    }

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
                "\nName: " +this.getName() +
                "\nSurname: " + this.getSurname() +
                "\nAge: " + this.getAge() +
                "\nStatus: " + this.getStatus() +
                "\nSalary: " + this.getSalary() +
                "\nTotal experience: " + this.getExperience());
    }
}
