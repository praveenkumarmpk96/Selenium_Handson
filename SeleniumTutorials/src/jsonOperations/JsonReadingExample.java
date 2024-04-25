package jsonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		/* 1.create object for json parser
		 * 2.File reader -  read from praveen.json
		 * 3.Parse the read file using parse() and store it in object
		 * 4.to get the values from the parsed object use get(),but
		 *   to do that we have to convert the object to json object
		 * 5.Now use,get() with key to retrieve name and age and store them after type casting
		 * 6.to fetch data from json array use iterator and iterate them and print
		 */
		
		JSONParser jsonParser = new JSONParser();
		
		FileReader fileReader = new FileReader("Praveen.json");
		
		Object parsedobject = jsonParser.parse(fileReader);
		
		JSONObject jsonObject = (JSONObject) parsedobject;
		
		String name = (String) jsonObject.get("Name");
		Long age = (Long) jsonObject.get("Age");
		
		JSONArray jsonArray = (JSONArray) jsonObject.get("special Qualities");
		
		Iterator iterator = jsonArray.iterator();
		
		System.out.println("Name is:" +name);
		System.out.println("Age is:" +age);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
