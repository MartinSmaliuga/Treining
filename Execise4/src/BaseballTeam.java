public class BaseballTeam {
	private String city, mascot;
	private int number0fPlayers;
	
	public boolean equals(Object obj) {
		if ( !(obj instanceof BaseballTeam))
			return false;

		BaseballTeam other = (BaseballTeam) obj;
		return (city.equals(other.city) && mascot.equals(other.mascot));
	
	}

	public int hashCode() {
		return number0fPlayers;
	
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	public int getNumber0fPlayers() {
		return number0fPlayers;
	}

	public void setNumber0fPlayers(int number0fPlayers) {
		this.number0fPlayers = number0fPlayers;
	}
	
	public static void main (String... args) {
		BaseballTeam one = new BaseballTeam();
		one.setCity("A");
		one.setMascot("B");
		one.setNumber0fPlayers(1);
		
		BaseballTeam two = new BaseballTeam();
		two.setCity("A");
		two.setMascot("B");
		two.setNumber0fPlayers(1);
		
		System.out.println(one.equals(two));
		
	}
}
