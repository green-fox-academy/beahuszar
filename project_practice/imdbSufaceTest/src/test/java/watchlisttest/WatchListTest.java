package watchlisttest;

import keywords.Login;
import keywords.WatchList;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class WatchListTest {
  private WebDriver driver;
  private String movieTitle;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    this.driver = new ChromeDriver();
    Login.imdbLogin("husz.beata@gmail.com","imdbPsw2019","https://www.imdb.com/", driver);
    this.movieTitle = "Star Wars";
  }

  @Test
  public void checkWatchList() {
    WatchList.checkWatchList(driver);
    assertEquals(WatchList.getWatchListCount(driver), WatchList.getTitleCount(driver));
  }

  @Test
  public void addFirstResultToWatchList() {
    WatchList.addFirstResultToWatchList(driver, movieTitle);
  }

  @Test
  public void addFirstResultToWatchListLowerButton() {
    WatchList.addFirstResultToWatchListLowerButton(driver, movieTitle);
  }
}
