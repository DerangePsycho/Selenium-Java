package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String email_field = "//input[@name='email']";
    public static String password_field ="//input[@name='password']";
    public static String login_button = "//button[@type='submit']";

}
