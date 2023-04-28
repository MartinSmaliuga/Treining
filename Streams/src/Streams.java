import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> integers =  List.of(1,2,3);
		
		/*
		integers.stream()
		.map(element -> element * 3)
		.filter(element -> element%2 == 0)
		.forEach(element -> {
			System.out.println("Element: " + element);
		});
		
		System.out.println(integers);
		*/
		
		/*
		List <Integer> collectedElements = integers.stream()
			.map(element -> element * 3)
			.filter(element -> element%2 == 0)
			.collect(Collectors.toList());
		
		System.out.println(integers);
		System.out.println(collectedElements);
		*/
		
		integers.forEach(element -> System.out.println(element));
		
		integers.forEach(System.out::println);

	}

}
