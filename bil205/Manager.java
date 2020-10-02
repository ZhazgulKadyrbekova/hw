public class Manager extends Employee {
	String company;
	String department;
	int experienceInDepartment;

	void work() {
		System.out.println(this.name + " works in " + this.company + " company");
	}

	void control() {
		System.out.println(this.name + " manages with workers of " + this.department +
			" department and works for " + this.experienceInDepartment + " years");
	}

	
}