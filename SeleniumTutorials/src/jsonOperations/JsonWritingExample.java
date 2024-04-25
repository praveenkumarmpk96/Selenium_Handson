package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*1.Create a Json object
		 * 2.Put the values into it
		 * 3.For array need to create array object and then add values into it
		 * 4.after that add array object to json object
		 * 5.And then using filewriter write json file
		 */

		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Name", "Praveen");
		jsonObject.put("Age", 27);
		
		JSONArray array = new JSONArray();
		
		array.add("magic smile");
		array.add("magnetic eyes");
		
		jsonObject.put("special Qualities", array);
		
		FileWriter fileWriter = new FileWriter("Praveen.json");
		
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
	}

}
