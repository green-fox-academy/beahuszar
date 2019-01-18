package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
  public static WebDriverWait wait;

  public Search() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void searchMovie(String movieTitle, WebDriver driver) {
    driver.findElement(By.id("navbar-query")).sendKeys(movieTitle, Keys.ENTER);
  }

  public static String getSearchResult(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/h1")));
    return searchResult.getText();
  }

  public static void chooseMovie(String movieTitle, WebDriver driver) {
    searchMovie(movieTitle, driver);
    wait = new WebDriverWait(driver, 10);
    WebElement check = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")));
    check.click();
  }

  public static String getChosenMovieTitleFromPage(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    WebElement movieTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/h1")));
    return movieTitle.getText();
  }
}
