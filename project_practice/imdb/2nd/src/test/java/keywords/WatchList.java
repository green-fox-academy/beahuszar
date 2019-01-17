package keywords;

import org.openqa.selenium.By;
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
}
