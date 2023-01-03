import java.util.logging.Logger;

public class LoggerClass {

    public static void main(String[] args) {
        System.out.println("..........................");
        Logger log = Logger.getLogger("Logging");
        log.info("This is just giving out INFORMATION");
        log.warning("This is a WARNING!!");
        log.severe("The situation is SEVERE!!");
        log.fine("This is a FINE message!");
    }

}
