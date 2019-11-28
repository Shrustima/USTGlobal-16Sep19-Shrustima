
public class TestB {
	static int a=20;//global variable
	int x;
	static TestB t; //static reference variable
	public static void add() {
	int a=10;//only final and first local variable are executed
		final int b=30;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is "+t.x);
	}
}
