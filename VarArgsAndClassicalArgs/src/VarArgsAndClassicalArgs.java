
public class VarArgsAndClassicalArgs {

	public static void main(String[] args) {		
		printContent();
		printContent2();

	}

	static void printContent(String[] parameters) {
		for(String param : parameters) {
			System.out.println("Param: " + param);
		}
	}
	
	static void printContent2(String... parameters ) {
		for(String param : parameters) {
			System.out.println("Param: " + param);
		}
	}

}
