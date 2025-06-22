package javaPro.lesson2.system;

public class SystemConfiguration {

    private String logLevel;
    private String logFilePath;

    public SystemConfiguration(String logLevel, String logFilePath) {
        setLogLevel(logLevel);
        setLogFilePath(logFilePath);
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        if (isValidLogLevel(logLevel)) {
            this.logLevel = logLevel;
        } else {
            System.out.println("Invalid log level: " + logLevel);
        }
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        if (logFilePath != null && !logFilePath.trim().isEmpty()) {
            this.logFilePath = logFilePath;
        } else {
            System.out.println("Invalid log file path.");
        }
    }

    private boolean isValidLogLevel(String level) {
        return level != null && (
                level.equalsIgnoreCase("INFO") ||
                        level.equalsIgnoreCase("DEBUG") ||
                        level.equalsIgnoreCase("WARN") ||
                        level.equalsIgnoreCase("ERROR")
        );
    }

    @Override
    public String toString() {
        return "SystemConfiguration{" +
                "logLevel='" + logLevel + '\'' +
                ", logFilePath='" + logFilePath + '\'' +
                '}';
    }

}