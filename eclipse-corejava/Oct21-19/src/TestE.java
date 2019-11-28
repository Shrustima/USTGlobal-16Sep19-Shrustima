
public class TestE {
	public static void main(String[] args) {
		Student.cname = "Qspiders";
		Student s = new Student();
		s.name = "Shru";
		s.usn = 70;
		System.out.println("College name is "+Student.cname);
		System.out.println("Student name is "+s.name);
		System.out.println("Student usn is "+s.usn);
		
	}
}
