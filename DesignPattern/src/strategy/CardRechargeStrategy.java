package strategy;
//³äÖµ¿¨²ßÂÔ
public class CardRechargeStrategy implements Strategy {

	@Override
	public Double calRecharge(Double charge, RechargeTypeEnum type) {
		// TODO Auto-generated method stub
		return charge+charge*0.01;
	}

}
