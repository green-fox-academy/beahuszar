package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WatchList {
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


}
