package test.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionok {
  public void actions() {
    WebDriver driver = new ChromeDriver();

    //Find and act
    driver.findElement(By.id("sign-in")).click();
    //Find, store and act --> faster
    WebElement signIn = driver.findElement(By.id("sign-in"));
    signIn.click();
    //remove text from input field
    driver.findElement(By.id("session_email")).clear();
    //typing a text & submitting a form
    WebElement email = driver.findElement(By.id("session_email"));
    email.sendKeys("mail@mail.com");
    driver.findElement(By.tagName("form")).submit();

    //GETTING INFORMATION
    signIn.getText(); //--> returns all text elements from children elements, it will only include text that is visible on the page
    signIn.getTagName(); // e.g. "<a>" for a link element
    signIn.getAttribute("data-test"); //for a provided attribute name
    signIn.isDisplayed(); //returns a boolean
    signIn.isEnabled(); //when working with buttons
  }

  public void actionsClass() {
    WebDriver driver = new ChromeDriver();
    WebElement element = driver.findElement(By.id("sign-in"));
    WebElement element2 = driver.findElement(By.id("blah"));
    Actions action = new Actions(driver);
    action.click(element).build().perform();

    //hover
    action.moveToElement(element).build().perform();
    //drag n drop
    action.dragAndDrop(element, element2).build().perform();
    //click pause release
    action.clickAndHold(element).pause(100).release().build().perform();
  }
}
