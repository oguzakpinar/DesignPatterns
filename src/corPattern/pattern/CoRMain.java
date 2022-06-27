package corPattern.pattern;

public class CoRMain {
    public static void main(String[] args) {
        AbstractLogger loggerChain = AbstractLoggerProvider.getLoggerChain();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
