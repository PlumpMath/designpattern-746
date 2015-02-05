package strategy;
//ÍøÒø²ßÂÔ
public class EBankStrategy implements Strategy {

	@Override
	public Double calRecharge(Double charge, RechargeTypeEnum type) {
		// TODO Auto-generated method stub
		return charge*0.85;
	}

}
