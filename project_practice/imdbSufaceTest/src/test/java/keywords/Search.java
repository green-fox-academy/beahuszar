package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
  public Search() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void searchMovie(String movieTitle, WebDriver driver) {
    driver.findElement(By.id("navbar-query")).sendKeys(movieTitle, Keys.ENTER);
  }

  public static String getSearchResult(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/h1")));
    return searchResult.getText();
  }
}
