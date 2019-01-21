package watch_issue_test;

import keywords.Login;
import keywords.WatchIssue;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
  }
}
