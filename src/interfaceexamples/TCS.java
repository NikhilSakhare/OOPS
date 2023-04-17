package interfaceexamples;

public class TCS extends Infosys{

	@Override
	public void development() {
		// TODO Auto-generated method stub
		System.out.println("Development done by TCS");
		
	}
	public static void main(String[] args) {
		
		TCS tcs =new TCS();
		tcs.design();
		tcs.development();
	}

}
