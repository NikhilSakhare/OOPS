package polymorphism;

public class MethodOverloading {
	public final void add(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	public final void add(int a, int b, int c)  {
		int d=a+b+c;
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		MethodOverloading mld = new MethodOverloading();
		mld.add(23,40);
		mld.add(23,40,80);
	}

}
