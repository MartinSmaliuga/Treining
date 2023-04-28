import java.util.ArrayList;

public class TestClass {

	public ArrayList<String> strArrayList;
	public void init() {
		strArrayList = new ArrayList<String>();
		strArrayList.add("Ann");
		strArrayList.add("Christine");
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.init();
		System.out.println("Size of ts: " + tc.strArrayList.size());

	}

}
