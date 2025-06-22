package javaPro.lesson2.system;

public class SystemConfigurationDemo {

    public static void main(String[] args) {
        SystemConfiguration config = new SystemConfiguration("INFO", "/var/logs/app.log");

        System.out.println(config);

        config.setLogLevel("DEBUG");
        config.setLogLevel("LOW");

        config.setLogFilePath("");

        System.out.println(config);
    }
}
