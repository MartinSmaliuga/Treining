
public class Equals {

	public static void main(String[] args) {
		String str1 = new String("value1");
		String str2 = new String("value2");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str21 = new String("value1");
		String str22 = new String("value1");
		
		System.out.println(str21 == str22);
		System.out.println(str21.equals(str22));
		
		String str31 = "value1";
		String str32 = "value1";
		
		System.out.println(str31 == str32);
		System.out.println(str31.equals(str32));
		
	}

}
