package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchIssue {
  private static WebElement myOpenIssues;
  private static WebDriverWait wait;
  private static WebElement issuesMenu;
  private static WebElement pageHeader;
  private static WebElement firstOpenIssue;
  private static WebElement startWatchingLink;
  private static WebElement watcherData;

  public WatchIssue() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
  }

  public static void listIssues(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    driver.manage().window().maximize();
    issuesMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("find_link")));
    issuesMenu.click();
    myOpenIssues = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filter_lnk_my_lnk")));
    myOpenIssues.click();
  }

  public static String getWatchListPageHeader(WebDriver driver) {
   wait = new WebDriverWait(driver, 10);
   pageHeader = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search-header-view\"]/div/h1")));

   return pageHeader.getAttribute("title").toLowerCase();
  }

  public static void openFirstIssue(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    firstOpenIssue = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("key-val")));
    firstOpenIssue.click();
  }

  public static String checkIssueTag(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    firstOpenIssue = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("key-val")));
    return firstOpenIssue.getText();
  }

  public static void startWatchingCurrentIssue(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    startWatchingLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("watching-toggle")));
    startWatchingLink.click();
  }

  public static int getWatcherData(WebDriver driver) {
    wait = new WebDriverWait(driver, 10);
    watcherData = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("watcher-data")));
    return Integer.parseInt(watcherData.getText());
  }
}
