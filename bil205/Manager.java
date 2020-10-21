public class Manager extends Employee {
	String company;
	String department;
	int experienceInDepartment;

	public Manager() {
		super();
	}

	public Manager(String name, String surname, int age, String status, int salary, int experience, String company, String department, int experienceInDepartment) {
		super(name, surname, age, status, salary, experience);
		this.company = company;
		this.department = department;
		this.experienceInDepartment = experienceInDepartment;
	}

	void work() {
		System.out.println(this.name + " works in " + this.company + " company");
	}

	void control() {
		System.out.println(this.name + " manages with workers of " + this.department +
			" department and works for " + this.experienceInDepartment + " years");
	}

	void info(){
		System.out.println("\tInfo:" +
				"\nName: " +this.name +
				"\nSurname: " + this.surname +
				"\nAge: " + this.age +
				"\nStatus: " + this.status +
				"\nSalary: " + this.salary +
				"\nTotal experience: " + this.experience +
				"\nCompany: " + this.company +
				"\nDepartment: " + this.department +
				"\nExperience: " + this.experienceInDepartment);
	}
}