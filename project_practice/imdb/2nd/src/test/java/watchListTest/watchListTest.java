package watchListTest;

import keywords.Login;
import keywords.WatchList;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class watchListTest {
  private WebDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    this.driver = new ChromeDriver();
    Login.imdbLogin("husz.beata@gmail.com","imdbPsw2019","https://www.imdb.com/", driver);
  }

  @Test
  public void checkWatchList() {
    WatchList.checkWatchList(driver);

    
  }
}
