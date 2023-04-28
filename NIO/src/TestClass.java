import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestClass {
	public static void printPathInfo(Path path) {
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		
		Path currentPath = path;
		while((currentPath = currentPath.getParent())!= null) {
			System.out.println(currentPath);
			
		}
		
		try {
		List<String> lines = Files.readAllLines(path);
		lines.forEach(System.out::println);
		} catch (IOException e) {
			throw new RuntimeException(e);
			
		}
	}
	
	public static void walkPath (Path path) throws IOException {
		Files.walk(path)
			.filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);;
		
	}
	
	public static void  main(String... args) throws IOException {
		//printPathInfo(Paths.get("C:\\Users\\marti\\Documents\\Programming\\Java\\Treining\\NIO\\src\\TestClass.java"));
		
		walkPath(Paths.get("C:\\Users\\marti\\Documents\\Programming\\Java\\Treining"));
		
	}
	
}
