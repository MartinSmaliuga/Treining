
public class ChangingValueInIfCondition {

	public static void main(String[] args) {
		boolean flag = true;
		if(flag = false)
			System.out.println('1');
		else if (flag)
			System.out.println('2');
		else if (!flag)
			System.out.println('3');
		else
			System.out.println('4');

	}
	
}
