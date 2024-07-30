package singleton;

public class LoggerTest {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger = Logger.getInstance();
        
        // Log some messages
        logger.log("This is a log message.");
        logger.log("Another log message.");
        
        // Verify that the same instance is used
        Logger anotherLogger = Logger.getInstance();
        if (logger == anotherLogger) {
            System.out.println("Both logger instances are the same.");
        }
    }
}

