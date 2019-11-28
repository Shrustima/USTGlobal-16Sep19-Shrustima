
public class TestC {
public static void main(String[] args) {
	Person.color="white";
	Person.sleep();
	System.out.println("person color is "+Person.color);
	Person p=new Person();
	p.age=22;
	p.name="shru";
	System.out.println("person age is"+p.age);
	System.out.println("person name is "+p.name);
	p.eat();
	p.walk();
	
	
	System.out.println("-------------                                                                                ");
	Person p2=new Person();
	p2.age=22;
	p2.name="shra";
	System.out.println("p2 name is "+p2.name);
	System.out.println("p2 age is "+p2.age);
}
}
