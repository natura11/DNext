package dnext.com.step_definitions.api;

import com.utilities.DbUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@db")
    public void dbHook() {
        System.out.println("creating database connection");
        DbUtils.createConnection();

    }

    @After("@db")
    public void afterDbHook() {
        System.out.println("closing database connection");
        DbUtils.destroyConnection();

    }
}
