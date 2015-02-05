package strategy;

import java.util.HashMap;
import java.util.Map;

//���Թ���
public class StrategyFactory {
	private static StrategyFactory factory = new StrategyFactory();

	private StrategyFactory() {};

	private static Map<Integer,Strategy> strategyMap = new HashMap<Integer,Strategy>();

	static {
		strategyMap.put(RechargeTypeEnum.E_BANK.getValue(),new MobileStrategy());
		strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.getValue(),new BusiAccountsStrategy());
		strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.getValue(),new CardRechargeStrategy());
		strategyMap.put(RechargeTypeEnum.MOBILE.getValue(),new MobileStrategy());
	}

	public static StrategyFactory getInstance() {
		return factory;
	}
	
	//ͨ�����ͻ�ȡmap����Ĳ��Զ���
	public Strategy creator(Integer type) {
		return strategyMap.get(type);
	}
}
