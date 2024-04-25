package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UsingPath.txt";
		String Content = "Path is more or like outputstream to write in bytes";
		
		Path path = Paths.get(location);
		Files.write(path, Content.getBytes());
	}

}
