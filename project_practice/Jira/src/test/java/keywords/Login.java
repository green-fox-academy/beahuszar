package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
  private static WebElement logIn;
  private static WebElement userNameField;
  private static WebElement pwdField;
  private static WebDriverWait wait;


  public Login() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void logIn(WebDriver driver, String userName, String pwd, String url) {
    wait = new WebDriverWait(driver, 10);
    driver.get(url);

    logIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-form-submit")));
    userNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-form-username")));
    pwdField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-form-password")));

    userNameField.clear();
    pwdField.clear();

    userNameField.sendKeys(userName);
    pwdField.sendKeys(pwd);

    logIn.click();
  }
}
