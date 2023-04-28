public class InitValues {
	int[] ia = new int[1];
	Object oA[] = new Object[1];
	boolean bool;
	
	public static void main (String... args) {
		InitValues one = new InitValues();
		System.out.println(one.ia[0] + " " + one.oA[0] + " " + one.bool);
		
	}
	
}
