
public class main {
	
	@FunctionalInterface
	interface FruitEater<T> {
		void consume(T t);
	
	}
	
	public static void main(String[] args) {
		FruitEater<String> stringFruitEater = new FruitEater<> () {
			@Override
			public void consume (String fruit) {
				System.out.println("Consumed element: " + fruit);
				
			}
		};
		
		process(stringFruitEater, "something");

	}
	
	static <T> void process(FruitEater<T> fruitEater, T consumedObject) {
		fruitEater.consume(consumedObject);
		
	}

}
