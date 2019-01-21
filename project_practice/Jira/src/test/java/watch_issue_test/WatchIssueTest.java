package watch_issue_test;

import keywords.Login;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WatchIssueTest {
  private WebDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    this.driver = new ChromeDriver();
    Login.logIn(driver, "beahuszar", );
  }
}
