package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorExample {

	static Logger log = Logger.getLogger(XMLConfiguratorExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		DOMConfigurator.configure("log4j.xml");
		log.debug("This is a debug message");
		log.info("This is an info");
		log.warn("This is a warning");
		log.error("This is an error");
		log.fatal("This is a fatal message");
		
	}

}
