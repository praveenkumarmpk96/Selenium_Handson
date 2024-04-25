package fileWritingOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location = "UsingFileoutputstream.txt";
		String content = "Used to write the contents of byte array";

		FileOutputStream fileOutputStream = new FileOutputStream(Location);

		byte[] bytes = content.getBytes();

		fileOutputStream.write(bytes);
		fileOutputStream.close();
	}

}
