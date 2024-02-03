package optiim.framework;

import optiim.framework.helpers.NavigateURLDispatcher;
import optiim.framework.utils.log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import static java.lang.System.out;

public class Props {
    //private static final Logger LOG = LoggerFactory.getLogger(Props.class);
    private static Properties environmentProps;
    private static Properties properties;

    private static String frontEndURL;
    private static String backEndURL;

    public static NavigateURLDispatcher navigator;


    /**
     * Gets the key from messages.properties for a Site
     *
     * @param key
     **/
    public static String getMessage(String key) {

        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return ResourceBundle.getBundle("props/messages").getString(key);
        }
    }

    /**
     * Gets the key from Config.properties related to chosen profile
     *
     * @param key
     **/

    public static String getProp(String key) {
        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return properties.getProperty(key);
        }
    }


    public static void loadRunConfigProps(String configPropertyFileLocation) {
        properties = new Properties();
        try (InputStream inputStream = Props.class.getResourceAsStream(configPropertyFileLocation)) {
            properties.load(inputStream);
            properties.list(out);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
//        properties = new Properties();
//        try (InputStream inputStream = Props.class.getResourceAsStream(environmentProps.getProperty("profile.path"))) {
//            properties.load(inputStream);
//            properties.list(out);
//        } catch (IOException e) {
//            log.error(e.getMessage());
//        }
    }

    public static NavigateURLDispatcher getNavigator() {
        return navigator;
    }

    public static void setNavigator(NavigateURLDispatcher navigator) {
        Props.navigator = navigator;
    }
}
