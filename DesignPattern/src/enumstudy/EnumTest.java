package enumstudy;

public enum EnumTest {
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) {
		@Override
		public boolean isRest() {
			return true;
		}
	},
	SUN(0) {
		@Override
		public boolean isRest() {
			return true;
		}
	};
	
	private int value;

	private EnumTest(int value) {
		this.value = value;
	}

	public boolean isRest() {
		return false;
	}
	
	public int getValue(){
		return this.value;
	}
}
