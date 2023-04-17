package Interface_01;

public class A1 implements printable{

		@Override
	public void print() {
	System.out.println("Hello Java");
	
	}

		public static void main(String[] args) {
			A1 obj =new A1();
			obj.print();
		}
}
