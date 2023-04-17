package Interface_01;

public class TestInterface1 {

	public static void main(String[] args) {
		Bank b =new SBI();
		
		System.out.println("ROI   "+b.rateOfIntrest());
	}
}
