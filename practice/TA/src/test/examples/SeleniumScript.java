package test.examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumScript {

  @Test
  public void openBrowser() {
    // Set location of chromedriver
    System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");

    // Start session (opens browser)
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.imdb.com/");
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement signIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("imdb-signin-link")));
    signIn.click();

    // Quit session (closes browser)
    driver.quit();
  }

  @Rule
  public TestWatcher watcher = new TestWatcher() {
    @Override
    protected void succeeded(Description description) {
      System.out.println(description.getMethodName() + ": Succeeded");
    }

    @Override
    protected void failed(Throwable e, Description description) {
      System.out.println(description.getMethodName() + ": Failed");
    }
  };


}
