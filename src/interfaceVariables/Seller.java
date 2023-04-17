package interfaceVariables;

public class Seller implements customer {

	@Override
	public void purchas() {
		
		// TODO Auto-generated method stub
		//quantityOfSugar=50;
		System.out.println("I need " + quantutyOfSugar + "kg of sugar");
	}
		public static void main(String[] args) {
			Seller s= new Seller();
			System.out.println(s.quantutyOfSugar);
			s.purchas();
		}
	

}
