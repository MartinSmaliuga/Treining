
public class Lambda {

	public static void main(String[] args) {
		//Thread thread = new Thread() {
		//	@Override
		//	public void run() {
		//		System.out.println("Some words");
		//	}
		//	
		//};
		
		Thread thread = new Thread(() -> {
			System.out.println("Some words");
		});
		
		thread.start();
		
	}

}
