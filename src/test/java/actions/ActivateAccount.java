package actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import utility.JsonDataReader;

import static pages.ActivateAccountPage.*;

public class ActivateAccount extends BrowserDriver {

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    static String filePath = "C:\\Users\\MarcRint\\IdeaProjects\\SeleniumCucumberTests\\src\\test\\java\\TestData\\TestData.json";
    static Map<String, String> testData = JsonDataReader.readTestData(filePath);

    public static void navigateToKycPage() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nextButton)));
        driver.findElement(By.xpath(nextButton)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nextButton)));
        driver.findElement(By.xpath(nextButton)).click();

        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public static void fillUpGeneralInformation() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(businessNameField)));
        driver.findElement(By.xpath(businessNameField)).clear();
        driver.findElement(By.xpath(businessNameField)).sendKeys(testData.get("BusinessName"));
        driver.findElement(By.xpath(customerServiceNumberField)).clear();
        driver.findElement(By.xpath(customerServiceNumberField)).sendKeys(testData.get("CustomerServiceNumber"));
        driver.findElement(By.xpath(addressLine1Field)).sendKeys(testData.get("BusinessAddress"));
        driver.findElement(By.xpath(cityField)).sendKeys(testData.get("BusinessCityAddress"));

        driver.findElement(By.xpath(regionDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("BusinessRegion")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("BusinessRegion")+"')]")).click();

        driver.findElement(By.xpath(zipField)).sendKeys(testData.get("BusinessZipCode"));
        driver.findElement(By.xpath(physicalStoreRadioButton)).click();

        driver.findElement(By.xpath(employeeNumberDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("NumberOfEmployees")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("NumberOfEmployees")+"')]")).click();

        driver.findElement(By.xpath(businessIndustryDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("Industry")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("Industry")+"')]")).click();

        driver.findElement(By.xpath(productDescriptionField)).sendKeys(testData.get("ProductDescription"));
        driver.findElement(By.xpath(onlinePresenceField)).sendKeys(testData.get("OnlinePresenceLine"));
        driver.findElement(By.xpath(businessHandleField)).clear();
        Random rand = new Random();
        int randInt1 = rand.nextInt(1000);
        driver.findElement(By.xpath(businessHandleField)).sendKeys(testData.get("BusinessHandle")+randInt1);
        driver.findElement(By.xpath(step3NextButton)).click();

    }

    public static void fillUpBusinessInformationSteps ()throws InterruptedException{

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectBusinessType)));
        driver.findElement(By.xpath(selectBusinessType)).click();
        driver.findElement(By.xpath(step4NextButton1)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='upload__button']")));
        WebElement upload_file = driver.findElement(By.xpath(uploadDTIDocuments));
        upload_file.sendKeys(testData.get("DTIDocumentLocation"));

        driver.findElement(By.xpath(clickDateField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(birthdayInputField)));
        driver.findElement(By.xpath(birthdayInputField)).sendKeys(testData.get("Birthday"));

        driver.findElement(By.xpath(nationalityDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("Nationality")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("Nationality")+"')]")).click();

        driver.findElement(By.xpath(cityOfBirthField)).sendKeys(testData.get("CityOfBirth"));

        driver.findElement(By.xpath(countryOfBirthDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("CountryOfBirth")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("CountryOfBirth")+"')]")).click();

        driver.findElement(By.xpath(step4AddressLine1)).sendKeys(testData.get("PersonAddressLine1"));
        driver.findElement(By.xpath(step4CityField)).sendKeys(testData.get("PersonCity"));

        driver.findElement(By.xpath(step4RegionDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("PersonRegion")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("PersonRegion")+"')]")).click();

        driver.findElement(By.xpath(step4ZipField)).sendKeys(testData.get("PersonZipCode"));
        driver.findElement(By.xpath(businessDurationDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("BusinessDuration")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("BusinessDuration")+"')]")).click();

        driver.findElement(By.xpath(businessTIN)).clear();
        driver.findElement(By.xpath(businessTIN)).sendKeys(testData.get("BusinessTIN"));

        driver.findElement(By.xpath(bankDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '"+testData.get("BankName")+"')]")));
        driver.findElement(By.xpath("//div[contains(text(), '"+testData.get("BankName")+"')]")).click();


        driver.findElement(By.xpath(accountNameField)).clear();
        driver.findElement(By.xpath(accountNameField)).sendKeys(testData.get("BankAccountName"));

        driver.findElement(By.xpath(accountNumberField)).clear();
        driver.findElement(By.xpath(accountNumberField)).sendKeys(testData.get("BankAccountNumber"));

        driver.findElement(By.xpath(step42NextButton)).click();
    }

    public static void fillUpStatementofAcceptance()throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameField)));
        driver.findElement(By.xpath(firstNameField)).sendKeys(testData.get("FirstName"));
        driver.findElement(By.xpath(lastNameField)).sendKeys(testData.get("LastName"));
        driver.findElement(By.xpath(emailAddressField)).sendKeys(testData.get("Email"));
        driver.findElement(By.xpath(agreeRadioButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(authorizedPersons)));
        driver.findElement(By.xpath(authorizedPersons)).sendKeys(testData.get("AuthorizedPerson"));
        driver.findElement(By.xpath(signatureCanvas)).click();
        driver.findElement(By.xpath(finalSubmitButton)).click();
        Thread.sleep(5000);
    }

    public static void assertApplicationSubmission(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/section/aside/div/ul/li/ul/li[1]")));
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/aside/div/ul/li/ul/li[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submissionConfirmation)));
        String text = driver.findElement(By.xpath(submissionConfirmation)).getText();
        Assert.assertTrue(text.equals("Your application has been submitted for review, "+testData.get("FirstName")+"!"));
    }
}
