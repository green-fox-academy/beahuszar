package test.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

  public void useful() {
    WebDriver driver = new ChromeDriver();

    //locators (from html code)
    driver.findElement(By.id("CSS id"));
    driver.findElements(By.tagName("HTML tag"));
    driver.findElement(By.name("HTML name tag"));
    driver.findElements(By.className("CSS class"));
    driver.findElement(By.cssSelector("CSS selector"));
    driver.findElements(By.xpath("right click copy xpath e.g.: //a[@data-test= 'sign in']"));
    driver.findElement(By.linkText("text of the link"));
    driver.findElement(By.partialLinkText("part of the text of the link e.g.: one word"));

    //CSS selectors
    driver.findElement(By.cssSelector("#id-tag"));
    driver.findElement(By.cssSelector(".class-tag"));
    driver.findElement(By.cssSelector(".multiple-class.multiple-classtag"));
    driver.findElement(By.cssSelector("attribute: a[data-test=sign-in]"));
    driver.findElement(By.cssSelector("multiple attributes: a[data-test=sign-in][class='nav-item nav-link']"));

    //ELEMENT HIERARCHY
    //descendant
    driver.findElement(By.cssSelector(".navbar .nav-item"));
    //direct descendant (child)
    driver.findElement(By.cssSelector(".navbar-nav > .nav-item"));
    //first child
    driver.findElement(By.cssSelector("nav-item:first-child"));
    //last child
    driver.findElement(By.cssSelector("nav-item:last-child"));
    //second child
    driver.findElement(By.cssSelector("nav-item:nth-child(2)"));
    //second child from the end
    driver.findElement(By.cssSelector("nav-item:nth-last-child(1)"));

    //SUB-STRING ATTRIBUTE MATCHES
    //starts with text
    driver.findElement(By.cssSelector("a[data-test^=sign]"));
    //ends with text
    driver.findElement(By.cssSelector("a[data-test$=in]"));
    //contains text
    driver.findElement(By.cssSelector("a[data-test*=gn-in]"));

    //SIBLING ELEMENTS
    //immediate following sibling
    driver.findElement(By.cssSelector("a + .nav-item"));
    //immediate previous sibling
    driver.findElement(By.cssSelector(".nav-item ~ a"));


  }

}
