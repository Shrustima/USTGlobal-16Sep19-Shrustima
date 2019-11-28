
public class SubClass extends SuperClass{
	String s = "subclass variable";
	
	SubClass(){
		super();//if we dint write compler writes autmtclly
		System.out.println("sub class constructor");
	}
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("==================");
		super.superClassMethod();
		superClassMethod();
	}
}
