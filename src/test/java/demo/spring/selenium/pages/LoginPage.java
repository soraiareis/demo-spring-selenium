package demo.spring.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class LoginPage {

  @FindBy(id = "username")
  WebElement usernameInput;

  @FindBy(id = "password")
  WebElement passwordInput;

  @FindBy(className = "radius")
  WebElement loginButton;

  public LoginPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public void typeUsername(String username) {
    this.usernameInput.sendKeys(username);
  }

  public void typePassword(String password) {
    this.passwordInput.sendKeys(password);
  }

  public void clickLogin() {
    loginButton.click();
  }
}
