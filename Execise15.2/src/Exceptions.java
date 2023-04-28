
public class Exceptions {

	public void doA(int k) throws Exception {
		for (int i = 0; i < 10; i++) {
			if (i == k)
				throw new Exception("Index of k is " + i);
				
		}
		
	}
	
	public void doB(boolean bool) {
		if (bool)
			try {
				doA(15);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		Exceptions exs = new Exceptions();
		

	}

}
