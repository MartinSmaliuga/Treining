
public class SM {
	public String checkIt (String a) {
		if (a.length()==0 || a == null)
			return "Empty";
		else return "Not empty";
		
	}
	
	public static void main(String[] args) {
		SM a = new SM();
		a.checkIt(null);

	}

}
