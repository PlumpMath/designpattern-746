package strategy;
//ÉÌ»§²ßÂÔ
public class BusiAccountsStrategy implements Strategy {

	@Override
	public Double calRecharge(Double charge, RechargeTypeEnum type) {
		// TODO Auto-generated method stub
		return charge*0.90;
	}

}
