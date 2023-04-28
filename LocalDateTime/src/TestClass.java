import java.time.ZoneId;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {
		//Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		
		//for (String str: availableZoneIds)
		//	System.out.println(str);
		
		//availableZoneIds.forEach(str -> System.out.println(str));
		
		//availableZoneIds.forEach(System.out::println);
		
		/*
		availableZoneIds.stream()
			.sorted()
			.forEach(System.out::println);;
		*/
		
		TreeSet<String> availableZoneIds = new TreeSet<>(ZoneId.getAvailableZoneIds());
		
		availableZoneIds.forEach(System.out::println);
	}

}
