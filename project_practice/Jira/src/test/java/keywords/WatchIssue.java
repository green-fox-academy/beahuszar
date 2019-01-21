package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchIssue {
  private static WebElement myOpenIssues;
  private static WebDriverWait wait;

  public WatchIssue() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void openFirstIssueFromIssuesMenu(WebDriver driver) {
    wait = new WebDriverWait(driver, 15);
    myOpenIssues = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filter_lnk_my_lnk")));
    myOpenIssues.click();
  }
}
