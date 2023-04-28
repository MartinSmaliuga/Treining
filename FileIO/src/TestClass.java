import java.io.File;
import java.util.Arrays;

public class TestClass {
	
	static void printInfo(String path) {
		File file = new File(path);
		System.out.println("File exists: " + file.exists());
		
		if (file.exists()) {
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Parent: " + file.getParent());
			
			if (file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("Last modified at: " + file.lastModified());
				
			} else {
				File[] subFiles = file.listFiles();
				Arrays.stream(subFiles).forEach(subFile -> System.out.println(subFile.getName()));
				
			}
			
		}
		
	}
	
	public static void main(String... args) {
		printInfo("C:\\Users\\marti\\Documents\\Programming\\Java\\Treining\\FileIO\\src\\TestClass.java");
	}
	
}
