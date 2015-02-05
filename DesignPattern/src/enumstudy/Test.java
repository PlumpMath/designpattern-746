package enumstudy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(EnumTest e:EnumTest.values()){
			System.out.println(e+"=="+e.getValue());
		}
		System.out.println(EnumTest.SUN.getValue());
	}

}
