package demo.spring.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
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

