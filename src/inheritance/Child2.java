package inheritance;

public class Child2 extends Parent2{
	public void sub() {
		int a = 20;
		int b = 10;
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		
		Parent1 p=new Parent1();
		p.add();
		p.mul();
		//p.sub();
		
		Child c = new Child();
		c.sub();
		c.add();
		c.mul();
		System.out.println(c.p);
		System.out.println(c.q);

		
		Parent p1=new Child();
		p1.add();
		p1.mul();
	//	p1.sub();
		
		
	//	Child2 c1=new Parent2();
		
	}

}
