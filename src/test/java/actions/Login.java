package actions;

import org.openqa.selenium.By;
import utility.BrowserDriver;
import utility.JsonDataReader;
import java.util.Map;

import static pages.LoginPage.*;

public class Login extends BrowserDriver {

    public static void loginToPage(){
        String filePath = "C:\\Users\\MarcRint\\IdeaProjects\\SeleniumCucumberTests\\src\\test\\java\\TestData\\TestData.json";
        Map<String, String> testData = JsonDataReader.readTestData(filePath);

        driver.findElement(By.xpath(email_field)).sendKeys(testData.get("EmailAddress"));
        driver.findElement(By.xpath(password_field)).sendKeys(testData.get("Password"));
        driver.findElement(By.xpath(login_button)).click();
    }

}
