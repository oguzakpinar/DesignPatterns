package corPattern.antipattern;

public class Logger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    public void logMessage(int level, String message){
        switch (level) {
            case ERROR:
                writeError(message);
            case DEBUG:
                writeDebug(message);
            case INFO:
                writeInfo(message);
        }
    }

    private void writeError(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

    private void writeDebug(String message) {
        System.out.println("File::Logger: " + message);
    }

    private void writeInfo(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}
