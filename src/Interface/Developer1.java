package Interface;

import interfaceexamples.Requirment;

public class Developer1 implements Requirment {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=30;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Developer1 d1 =new Developer1();
		d1.add();
		d1.sub();
		}

	
}
