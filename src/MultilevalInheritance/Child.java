package MultilevalInheritance;

public class Child extends Parent {

	public void m2() {
		System.out.println("M2 method of child class");
	}
	public static void main(String[] args) {
		Child c1= new Child();
		c1.m1();
		c1.m2();
	}
}
