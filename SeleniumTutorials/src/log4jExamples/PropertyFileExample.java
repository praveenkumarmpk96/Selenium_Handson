package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileExample {

	static Logger log = Logger.getLogger(PropertyFileExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropertyConfigurator.configure("log4j.properties");
		log.debug("This is a debug message");
		log.info("This is an info");
		log.warn("This is a warning");
		log.error("This is an error");
		log.fatal("This is a fatal message");
	}

}
