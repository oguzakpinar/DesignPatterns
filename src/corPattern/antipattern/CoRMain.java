package corPattern.antipattern;


import java.nio.file.LinkOption;

public class CoRMain {
    public static void main(String[] args) {
        Logger loggerChain = new Logger();

        System.out.println();
        loggerChain.logMessage(Logger.INFO,
                "This is an information.");
        System.out.println();
        loggerChain.logMessage(Logger.DEBUG,
                "This is an debug level information.");
        System.out.println();
        loggerChain.logMessage(Logger.ERROR,
                "This is an error information.");
    }
}
