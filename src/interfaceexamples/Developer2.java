package interfaceexamples;

public class Developer2 extends Developer1 {
	 public void sub() {
		 int a=20;
		 int b=40;
		 int c=a-b;
		 System.out.println(c);
	 }
	 public static void main(String[] args) {
		
		 Developer2 d2 =new Developer2();
		 d2.add();
		 d2.sub();
	}

}
