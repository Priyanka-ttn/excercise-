import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Test.class.getName());
        logger.info("Hello world");
    }
}
