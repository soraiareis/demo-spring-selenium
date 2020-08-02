package demo.spring.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

  @FindBy(linkText = "Form Authentication")
  WebElement formAuthentication;

  public HomePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public void clickFormAuthentication() {
    formAuthentication.click();
  }
}

