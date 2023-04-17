//Abstract Class
package Interface;

public class TCS extends  SBI{

	@Override
	public void design() {
		System.out.println("Design done By TCS");
		
	}

	@Override
	public void develop() {
		System.out.println("Development done by TCS");
		
	}
	public static void main(String[] args) {
		
		TCS tcs =new TCS();
		tcs.design();
		tcs.develop();
		
		SBI sbi=new TCS();
		sbi.design();
		sbi.develop();
	}
	
	
	

}
