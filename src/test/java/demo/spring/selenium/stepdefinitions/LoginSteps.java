package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.LoginPage;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

  @Autowired
  private LoginPage loginPage;

  @When("^I fill the username with \"(.*)\"$")
  public void iFillTheUsernameInputWith(String username) {
    this.loginPage.typeUsername(username);
  }

  @When("^I fill the password with \"(.*)\"$")
  public void iFillThePasswordInputWith(String password) {
    this.loginPage.typePassword(password);
  }

  @When("^I click on Login$")
  public void iClickOnLoginButton() {
    this.loginPage.clickLogin();
  }
}
