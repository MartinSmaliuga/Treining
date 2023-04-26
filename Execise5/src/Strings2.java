
public class Strings2 {

	public static void main(String[] args) {
		String a = new String("ARcZguv");
		String b = new String("b");
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode() == b.hashCode());
		
		b = a+a;
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode() == b.hashCode());

	}

}
