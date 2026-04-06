package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void start() {
        System.out.println("=== Test Started ===");
    }

    @After
    public void end() {
        System.out.println("=== Test Finished ===");
    }
}