package strategy;

public class Client {

	public static void main(String[] args) {
		Context con = new Context();
		
		Double money = con.calRecharge(100D, 1);
		Double money1 = con.calRecharge(100D, 2);
		Double money2 = con.calRecharge(100D, 3);
		Double money3 = con.calRecharge(100D, 4);
		
		System.out.println("money:"+money);
		System.out.println("money1:"+money1);
		System.out.println("money2:"+money2);
		System.out.println("money3:"+money3);
	}
	
	
}
