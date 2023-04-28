
public class main {
	@FunctionalInterface
	interface FruitEater<T> {
		void consume(T t);
	
	}
	
	class StringFruitEater implements FruitEater<String> {
		@Override
		public void consume (String fruit) {
			System.out.println("Consumed element: " + fruit);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
