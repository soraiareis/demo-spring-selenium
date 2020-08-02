package demo.spring.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class WebDriverManager {

  @Bean
  @Scope("cucumber-glue")
  public WebDriver webDriverFactory() {
    return new FirefoxDriver();
  }
}

