package watch_issue_test;

import keywords.Login;
import keywords.WatchIssue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class WatchIssueTest {
  private WebDriver driver;
  private String userName = System.getenv("JIRA_UN");
  private String pwd = System.getenv("JIRA_PWD");

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    this.driver = new ChromeDriver();
    Login.logIn(driver, userName, pwd, "http://jira.greenfox.academy/login.jsp");
  }

  @Test
  public void listIssues() {
    WatchIssue.listIssues(driver);

    assertEquals("my open issues", WatchIssue.getWatchListPageHeader(driver));
  }

  @Test
  public void openFirstIssue() {
    WatchIssue.listIssues(driver);
    WatchIssue.openFirstIssue(driver);

    assertEquals("ALPHA-4", WatchIssue.checkIssueTag(driver));
  }

  @Test
  public void watchIssue() {
    WatchIssue.listIssues(driver);
    WatchIssue.openFirstIssue(driver);
    int originalWatcherData = WatchIssue.getWatcherData(driver);
    WatchIssue.startWatchingCurrentIssue(driver);
    WebElement element = driver.findElement(By.tagName("body"));
    element.sendKeys(Keys.F5);
    int refreshedWatcherData = WatchIssue.getWatcherData(driver);

    assertEquals(originalWatcherData + 1, refreshedWatcherData);
  }
}
