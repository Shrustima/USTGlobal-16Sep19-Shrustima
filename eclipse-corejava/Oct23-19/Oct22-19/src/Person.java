
public class Person {
	String name;
	int age;
	//parameterized constructor
	Person(String pname, int page){
		name = pname;
		age = page;
	}
	public static void main(String[] args) {
		Person p = new Person("shrusti", 22);
		Person p1 = new Person("shivani", 24);
		Person p2 = new Person("shraddha", 26);

	}
}
