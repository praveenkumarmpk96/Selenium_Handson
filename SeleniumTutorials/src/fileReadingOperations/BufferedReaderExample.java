package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location = "UsingBufferedwriter.txt";
		
		FileReader reader = new FileReader(Location);
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String currentline;
		
		while ((currentline = bufferedReader.readLine())!= null) {
		System.out.println(currentline);
	}
	}

}
