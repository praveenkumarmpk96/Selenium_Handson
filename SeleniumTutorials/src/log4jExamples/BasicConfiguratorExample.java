package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger log = Logger.getLogger(BasicConfiguratorExample.class); //Factory desing pattern

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		log.debug("This is a debug message");
		log.info("This is an info");
		log.warn("This is a warning");
		log.error("This is an error");
		log.fatal("This is a fatal message");
	}

}
