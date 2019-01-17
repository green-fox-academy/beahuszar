package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

  public Login() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void imdbLogin(String userName, String pwd, String url, WebDriver driver) {
    driver.get(url);

    WebDriverWait wait = new WebDriverWait(driver, 10);

    WebElement signIn = wait
        .until(ExpectedConditions
            .presenceOfElementLocated(By.id("imdb-signin-link")));
    signIn.click();

    WebElement imdbSignIn = driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]"));
    imdbSignIn.click();

    driver.findElement(By.id("ap_email")).clear();
    driver.findElement(By.id("ap_password")).clear();

    driver.findElement(By.id("ap_email")).sendKeys(userName);
    driver.findElement(By.id("ap_password")).sendKeys(pwd);
    driver.findElement(By.id("signInSubmit")).click();
  }

  public static String userName(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement nbusername = wait
        .until(ExpectedConditions
            .presenceOfElementLocated(By.id("nbusername")));
    return nbusername.getText();
  }
}

