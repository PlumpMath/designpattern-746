package strategy;

//策略枚举
public enum RechargeTypeEnum {
	
	E_BANK(1,"网银"),
	MOBILE(2,"手机"),
	CARD_RECHARGE(4,"充值卡"),
	BUSI_ACCOUNTS(3, "商户账号");
	
	private int value;
	private String description;
	
	private RechargeTypeEnum(int value,String description){
		this.value=value;
		this.description=description;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public static RechargeTypeEnum valueOf(int value) {
        for(RechargeTypeEnum type : RechargeTypeEnum.values()) {
            if(type.getValue() == value) {
                return type;
            }
        }
        return null;
    }
}
