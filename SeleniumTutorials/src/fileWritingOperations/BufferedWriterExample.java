package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location = "UsingBufferedwriter.txt";
		String content = "Bufferedwriter is the most used and it's performance is good";
		
		FileWriter fileWriter =new FileWriter(Location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

}
