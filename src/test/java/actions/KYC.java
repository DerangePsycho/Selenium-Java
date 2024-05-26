package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import java.time.Duration;
import java.util.ArrayList;

import static pages.ActivateAccountPage.*;
import static pages.KYCPage.*;

public class KYC extends BrowserDriver {

     public static void verifyIdentity() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
         ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectIDType)));
         driver.findElement(By.xpath(selectIDType)).click();
         driver.findElement(By.xpath(continueButton)).click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectPhilSysID)));
         driver.findElement(By.xpath(selectPhilSysID)).click();
         driver.findElement(By.xpath(continueButton2)).click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(navigateToCaptureSelfie)));
         driver.findElement(By.xpath(navigateToCaptureIDDetails)).click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(captureIDDetailsButton)));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(captureIDDetailsButton)));
         driver.findElement(By.xpath(captureIDDetailsButton)).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='capture-image-chip-container']")));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(captureIDDetailsButton)));
         driver.findElement(By.xpath(captureIDDetailsButton)).click();
         Thread.sleep(7000);
         Boolean thisElement = driver.findElements(By.xpath("//p[@class='MuiTypography-root error-text MuiTypography-body2']")).isEmpty();
         if (thisElement == true){
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveAndContinueIDButton)));
             driver.findElement(By.xpath(saveAndContinueIDButton)).click();
         }else{
             do {
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveAndContinueIDButton)));
                 driver.findElement(By.xpath(saveAndContinueIDButton)).click();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(captureIDDetailsButton)));
                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(captureIDDetailsButton)));
                 driver.findElement(By.xpath(captureIDDetailsButton)).click();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='capture-image-chip-container']")));
                 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(captureIDDetailsButton)));
                 driver.findElement(By.xpath(captureIDDetailsButton)).click();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveAndContinueIDButton)));
                 thisElement = driver.findElements(By.xpath("//p[@class='MuiTypography-root error-text MuiTypography-body2']")).isEmpty();
             }while (thisElement ==false);
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveAndContinueIDButton)));
             driver.findElement(By.xpath(saveAndContinueIDButton)).click();
         }

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(navigateToCaptureSelfie)));
         driver.findElement(By.xpath(navigateToCaptureSelfie)).click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='face-visible']")));
         driver.findElement(By.xpath(captureSelfieButton)).click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveAndContinueSelfieButton)));
         driver.findElement(By.xpath(saveAndContinueSelfieButton)).click();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submitButton)));
         Thread.sleep(5000);
         Boolean thisPhoto = driver.findElements(By.xpath("//p[@class='MuiTypography-root error-text MuiTypography-body2']")).isEmpty();
         if(thisPhoto == true){
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submitButton)));
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButton)));
             driver.findElement(By.xpath(submitButton)).click();
         }else {
             do{
                 driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text image-close-button-position image-close-button-styling']")).get(2).click();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(navigateToCaptureSelfie)));
                 driver.findElement(By.xpath(navigateToCaptureSelfie)).click();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='face-visible']")));
                 driver.findElement(By.xpath(captureSelfieButton)).click();
                 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveAndContinueSelfieButton)));
                 driver.findElement(By.xpath(saveAndContinueSelfieButton)).click();
                 Thread.sleep(7000);
                 thisPhoto = driver.findElements(By.xpath("//p[@class='MuiTypography-root error-text MuiTypography-body2']")).isEmpty();
             }while (thisPhoto == false);
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(submitButton)));
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButton)));
             driver.findElement(By.xpath(submitButton)).click();
         }

         Thread.sleep(5000);
         driver.switchTo().window(tabs.get(0));
         Thread.sleep(5000);

         Boolean refreshButton = (driver.findElements(By.xpath("//*[@id=\"root\"]/section/section/div/div/div[2]/div/div/div[2]/p[2]/button")).isEmpty());
         do{
             driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/div/div/div[2]/div/div/div[2]/p[2]/button")).click();
             Thread.sleep(5000);
             refreshButton = (driver.findElements(By.xpath("//*[@id=\"root\"]/section/section/div/div/div[2]/div/div/div[2]/p[2]/button")).isEmpty());
         }while ( refreshButton == false);
         driver.findElement(By.xpath(step2NextButton)).click();
     }
}
