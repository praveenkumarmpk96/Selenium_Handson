package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.File location 2.content
		
		String Location = "Usingfilewriter.txt";
		String content = "Filewriter is Good but performance is slow";
		
		FileWriter fileWriter = new FileWriter(Location);
		fileWriter.write(content);
		fileWriter.close();

	}

}
