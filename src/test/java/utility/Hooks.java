package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static BrowserDriver driver;

    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    @After
    public void tearDown() throws InterruptedException{
//        this.driver.close();
    }
}
