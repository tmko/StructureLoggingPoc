package tak.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Console;
import java.text.SimpleDateFormat;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(final String[] args)
    {
        Console c = System.console();

        String input = "";
        do {
            c.format(System.lineSeparator() + "Provide a message->");
            input = c.readLine();
            logger.atInfo().setMessage(input).addKeyValue("LogCreationTime", "currentTime").log();
        } while ( !input.isEmpty() );
    }

    public static String currentTime () {
        final String pattern = "yyyy.MM.dd.HH.mm.ss";
        return new SimpleDateFormat(pattern).format(new java.util.Date());
    }
}