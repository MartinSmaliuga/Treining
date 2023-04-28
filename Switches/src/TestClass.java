import java.io.IOException;

public class TestClass {

	public static int switchTest(int k) throws IOException {
		int j = 1;
		final int a = 5; //System.in.read()-48;
		switch (k) {
			case 1: j++;
			case 2: j++;
			case 3: j++;
			case 4: j++;
			case a: j++;
			default: j++;
		}
		return j+k;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(switchTest(4));
		
	}

}
