public class Employee {
    protected String name, surname;
    protected int age;
    protected String status;
    /*
    Employee классынын salary аттуу касиети финал колдонуучу созу менен жарыяланды.
    Анын маанисин коддун башка жеринде озгортууго тыюу салынат.
    Озгормону финал деп жарыялаганда созсуз маани ыйгаруу керек.
     */
    protected final int salary = 1500;
    protected int experience;

    public Employee() {
    }

    public Employee(String name, String surname, int age, String status, int experience) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setStatus(status);
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    /*
    Класстын методун финал деп жарыялоонун себеби, бала класста аны кайра жазууга тыюу салуу.
     */
    public final void work(){
        System.out.println(this.name + " is working.");
    }

    public void rest(int min){
        System.out.println(this.name + " is having a rest for " + min + " minutes.");
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
