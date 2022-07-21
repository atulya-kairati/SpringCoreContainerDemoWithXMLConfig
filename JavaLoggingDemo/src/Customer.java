import org.apache.log4j.Logger;

public class Customer {
	private static final Logger logger = Logger.getLogger(Customer.class);
	
//	log4j -> https://logging.apache.org/log4j/1.2/download.html

	public static void main(String args[]) {
		logger.error("ERROR");
		logger.warn("WARNING");
		logger.fatal("FATAL");
		logger.debug("DEBUG");
		logger.info("INFO");
		System.out.println("Final Output");
	}
}