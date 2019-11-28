
public class Employee1 {
	String name;
	int eid;
	
	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println("Employee1 name is "+name);
		System.out.println("Employee1 id is "+eid);
		this .sayHello();
	}
	void sayHello() {
		System.out.println("hello "+name+" welcome to USTGlobal");
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Shrusti", 131);
		e1.printDetails();
		Employee1 e2 = new Employee1("Shraddha", 220);
		e2.printDetails();
		Employee1 e3 = new Employee1("Pratiksha", 420);
		e3.printDetails();
	}
}
