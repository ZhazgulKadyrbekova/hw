/*
Manager классы финал колдонуучу созунун жардамы менен жарыяланды.
Себеби бул класстын башка бала класстарын жаратууга тыюу салуу максатында.
 */
public final class Manager extends Employee {
	private String department;
	private int experienceInDepartment;

	public Manager() {
		super();
	}

	public Manager(String name, String surname, int age, String status, int experience, String department, int experienceInDepartment) {
		super(name, surname, age, status, experience);
		this.setDepartment(department);
		this.setExperienceInDepartment(experienceInDepartment);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperienceInDepartment() {
		return experienceInDepartment;
	}

	public void setExperienceInDepartment(int experienceInDepartment) {
		this.experienceInDepartment = experienceInDepartment;
	}

	public void info(){
		System.out.println("\tInfo:" +
				"\nName: " +this.getName() +
				"\nSurname: " + this.getSurname() +
				"\nAge: " + this.getAge() +
				"\nStatus: " + this.getStatus() +
				"\nSalary: " + this.getSalary() +
				"\nTotal experience: " + this.getExperience() +
				"\nDepartment: " + this.getDepartment() +
				"\nExperience: " + this.getExperienceInDepartment());
	}
}