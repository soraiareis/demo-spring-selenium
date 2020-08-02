package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomeSteps {

  private HomePage homePage = new HomePage(Hooks.driver);

  @Given("^I open Login Page$")
  public void iOpenLoginPage() {
    homePage.clickFormAuthentication();
  }
}
