package interface_2;

public class A3 implements Printable,Show {

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Nikhil");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Sakhare");
		
	}
	public static void main(String[] args) {
		
	A3 a =new A3();

	a.Show();
	a.print();
	}
}


