package test.examples;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdvancedInteractions {
  public void jsExecutorAndAlert() {

    //Js executor
    WebDriver driver = new ChromeDriver();
    WebElement element = driver.findElement(By.id("sign-in"));

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("alert('Hello World');");
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    alert.accept(); //elfogadás

    assertEquals("Hello World", alertText);




    js.executeScript("arguments[0].click();", element);
    js.executeScript("windows.scrollBy[0,50]");
  }

  @Test
  public void cIsForCookie() {
    WebDriver driver = new ChromeDriver();
    driver.get("http://example.com");
    Cookie cookie = new Cookie.Builder("name", "value")
        .domain("example.com")
        .expiresOn(new Date(2020, 10, 31))
        .isHttpOnly(true)
        .isSecure(true)
        .path("/mypath")
        .build();

    driver.manage().addCookie(cookie);
    driver.get("http://example.com/mypath");

    Cookie found = driver.manage().getCookieNamed("name");
    assertEquals("value", found.getValue());
    driver.manage().deleteAllCookies();
    assertFalse(driver.manage().getCookies().contains(found));
  }

  @Test
  public void uploadFile() {
    WebDriver driver = new ChromeDriver();
    ((ChromeDriver) driver).setFileDetector(new LocalFileDetector());
    driver.get("https://the.internet.herokuapp.com/upload");
    WebElement inputElement = driver.findElement(By.id("file-upload"));
    inputElement.sendKeys("location of the file: /users/bla/bla/file");
    assertTrue(inputElement.getAttribute("value").contains("file"));
  }

  @Test
  public void frameSwitching() {
    WebDriver driver = new ChromeDriver();
    driver.switchTo().frame(1);
    assertEquals("BOTTOM", driver.findElement(By.tagName("body")).getText());

    driver.switchTo().parentFrame();
    driver.switchTo().frame("frame-top");
    driver.switchTo().frame("frame-left");
    assertEquals("LEFT", driver.findElement(By.tagName("body")).getText());

    driver.switchTo().defaultContent();
    assertTrue(driver.findElements(By.name("frame-top")).size() > 0);
  }

  @Test
  public void windowSwitching() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("windows.open('https://www.example.com');");

    String origWindow = driver.getWindowHandle();
    Set handles = driver.getWindowHandles();
    handles.remove(origWindow);

    String nextWindow = String.valueOf(handles.iterator().next());

    driver.switchTo().window(nextWindow);
    assertEquals("Example domain", driver.getTitle());

    driver.close();
    driver.switchTo().window(origWindow);
    assertEquals("google", driver.getTitle());

  }
}
