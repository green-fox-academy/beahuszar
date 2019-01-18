package logintest;

import keywords.Login;
import keywords.Search;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginTest {
  private WebDriver driver;

  @Before
  public void setUp() {
    //System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    driver = new ChromeDriver();
  }

  /*@After
  public void tearDown() {
    driver.quit();
  }*/

  @Test
  public void loginToPage() {
    Login.imdbLogin("husz.beata@gmail.com", "imdbPsw2019", "https://www.imdb.com/", driver);

    assertEquals("Beáta", Login.userName(driver));
  }
}
