package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.SpringContextConfiguration;
import demo.spring.selenium.config.DemoSpringSeleniumProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class Hooks {

  @Autowired
  private DemoSpringSeleniumProperties properties;

  @Autowired
  private WebDriver driver;

  @Before
  public void openBrowser() {
    driver.get(properties.getHost());
  }

  @After
  public void closeBrowser() {
    driver.quit();
  }
}

