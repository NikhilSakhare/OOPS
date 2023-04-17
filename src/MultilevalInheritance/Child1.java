package MultilevalInheritance;

public class Child1 extends Parent {

	public void m3() {
		System.out.println("m3 method of Child1 class");
	}

	public static void main(String[] args) {
		Child1 c1 =new Child1();
		c1.m1();
		c1.m2();
		c1.m3();
	}

	private void m2() {
		// TODO Auto-generated method stub
		
	}
}
