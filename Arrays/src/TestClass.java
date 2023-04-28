
public class TestClass {

	public static void main(String[] args) {
		int[] arr1 = new int[2];
		arr1[0] = 10;
		arr1[1] = 20;
		
		int[] arr2 = arr1;
		arr1[0] = 0;
		
		System.out.println(arr2 == arr1);
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);

	}

}
