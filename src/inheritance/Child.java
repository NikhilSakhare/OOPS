package inheritance;

public class Child extends Parent {


	public void sub() {
		int a = 20;
		int b = 10;
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.sub();
		c.add();
		c.mul();
		System.out.println(c.p);
		System.out.println(c.q);

}
}