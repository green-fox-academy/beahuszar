package searchtest;

import keywords.Login;
import keywords.Search;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SeachTest {
  private WebDriver driver;
  private String movieTitle;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    this.driver = new ChromeDriver();
    this.movieTitle = "Death Note";
    Login.imdbLogin("husz.beata@gmail.com","imdbPsw2019","https://www.imdb.com/", driver);
  }

  @Test
  public void searchMovie() {
    Search.searchMovie(movieTitle, driver);

    assertEquals("Results for \"" + movieTitle + "\"", Search.getSearchResult(driver));
  }
}
