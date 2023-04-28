public class Enum {
	enum JsonSerializationStrategy {
		CAMEL_CASE("camelCase"),
		SNAKE_CASE("snake_case"),
		KEBAB_CASE("kebab-case");
		
		private final String readabaleName;
		
		JsonSerializationStrategy(final String readableName) {
			this.readabaleName = readableName;
			
		}
		
		public String getReadableName() {
			return this.readabaleName;
			
		}

	}
	
	public static void main(String[] args) {
		JsonSerializationStrategy str1 = null;
		JsonSerializationStrategy str2 = JsonSerializationStrategy.CAMEL_CASE;
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}
	
}
