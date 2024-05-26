package utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;

    public ChromeOptions options;

    public  BrowserDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarcRint\\IdeaProjects\\SeleniumCucumberTests\\src\\test\\resources\\drivers\\chromedriver.exe");
        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dashboard.paymongo.com/login");
    }

    public void close(){
        this.driver.quit();
    }
}
