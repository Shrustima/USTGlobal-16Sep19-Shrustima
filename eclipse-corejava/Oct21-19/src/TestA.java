
public class TestA {
	public static void main(String[] args) {

		Pen p = new Pen();

		p.cost=100;
		p.color="blue";
		p.brand="Techno Tip";

		System.out.println("pen cost is "+p.cost);
		System.out.println("pen color is "+p.color);
		System.out.println("pen brand is "+p.brand);
		p.write();

		System.out.println("-------------");
		Van v = new Van();
		v.cost=1000000;
		v.color="Red";
		System.out.println("cost is "+v.cost);
		System.out.println("color is "+v.color);
		v.move();
		
		Van v1 = new Van();
		v1.cost=2000000;
		v1.color="White";
		System.out.println("cost is "+v1.cost);
		System.out.println("color is "+v1.color);
		v1.move();


	}
}
