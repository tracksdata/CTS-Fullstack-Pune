
import org.apache.log4j.Logger;

public class Test {

	public static void main(String[] args) {

		String parameter = "log4j demo";
		Logger logger = Logger.getLogger(Test.class);
		
		logger.debug("This is debug : " + parameter);

		logger.info("This is info : " + parameter);

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		logger.debug("This is debug-1 : " + parameter);
		System.out.println("-- done --");

	}

}
