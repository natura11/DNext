package optiim.framework.utils;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class log {

    // Initialize Log4j logs

    // This is to print log for the beginning of the test case, as we usually
    // run so many test cases as a test suite

    public static void startTestCase(String sTestCaseName) {

        log.info("****************************************************************************************");

        log.info("****************************************************************************************");

        log.info("$$$$$$$$$$$$$$$$$$$$$            " + sTestCaseName + "         $$$$$$$$$$$$$$$$$$$$$$$$$");

        log.info("****************************************************************************************");

        log.info("****************************************************************************************");

    }

    // This is to print log for the ending of the test case

    public static void endTestCase(String sTestCaseName) {

        log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + sTestCaseName + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

        log.info("X");

        log.info("X");

        log.info("X");

        log.info("X");

    }

    // Need to create these methods, so that they can be called

    public static void info(String message) {

        log.info(message);

    }

    public static void warn(String message) {

        log.warn(message);

    }

    public static void error(String message) {

        log.error(message);

    }

    public static void fatal(String message) {

        log.fatal(message);

    }

    public static void debug(String message) {

        log.debug(message);

    }

}