
public class Employee {
	String name;
	int eid;
	
	public Employee(String empname, int empid) {
		name = empname;
		eid = empid;
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("employee id is "+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Shrusti", 131);
		e1.printDetails();
		Employee e2 = new Employee("Shraddha", 220);
		e2.printDetails();
		Employee e3 = new Employee("Pratiksha", 420);
		e3.printDetails();
	}
}
