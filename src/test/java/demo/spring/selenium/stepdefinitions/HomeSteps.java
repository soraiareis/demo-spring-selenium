package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

  @Autowired
  private HomePage homePage;

  @Given("^I open Login Page$")
  public void iOpenLoginPage() {
    homePage.clickFormAuthentication();
  }
}
