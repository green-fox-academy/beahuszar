package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchList {
  public static WebDriverWait wait;

  public WatchList() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void checkWatchList(WebDriver driver) {
    WebElement watchListButton = driver.findElements(By.xpath("//*[@id=\"navWatchlistMenu\"]/p/a")).get(0);
    watchListButton.click();
  }

  public static int getTitleCount(WebDriver driver) {
    WebElement titleCount = driver.findElement(By.xpath("//*[@id=\"center-1-react\"]/div/div[2]/div[1]/div[2]/div/span[1]"));

    return Integer.parseInt(titleCount.getText().substring(0, 1));
  }

  public static int getWatchListCount(WebDriver driver) {
    try {
      WebElement watchListCount = driver.findElement(By.xpath("//*[@id=\"navWatchlistMenu\"]/p/span"));
      return Integer.parseInt(watchListCount.getText().substring(1, 2));
    } catch (NoSuchElementException e) {
      return 0;
    }
  }

  public static void addFirstResultToWatchList(WebDriver driver, String movieTitle) {
    Search.chooseMovie(movieTitle, driver);
    wait = new WebDriverWait(driver, 10);
    WebElement addToWatchListButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div")));
    System.out.println("isdufhsidf" + addToWatchListButton.getAttribute("title"));
    addToWatchListButton.click();
  }

  public static void addFirstResultToWatchListLowerButton(WebDriver driver, String movieTitle) {
    Search.chooseMovie(movieTitle, driver);
    wait = new WebDriverWait(driver, 10);
    WebElement addToWatchListButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"title-overview-widget\"]/div[2]/div[2]/span/div")));
    addToWatchListButton.click();
  }

  public static String getAddButtonTitle(WebDriver driver) {
    driver.navigate().refresh();
    wait = new WebDriverWait(driver, 10);
    WebElement addToWatchListButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div")));
    return addToWatchListButton.getAttribute("title");
  }

  public static String getLowerAddButtonTitle(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    WebElement addToLowerWatchListButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"title-overview-widget\"]/div[2]/div[2]/span/div")));
    return addToLowerWatchListButton.getAttribute("title");
  }
}
