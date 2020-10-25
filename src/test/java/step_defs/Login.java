package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

    WebDriver driver;

    @Given("User is on the facebook Login page")
    public void userIsOnTheFacebookLoginPage() {
     System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     Assert.assertTrue(driver.getTitle().contains("Log In"));
    }

    @And("user logs in with username,password")
    public void userLogsInWithUsernamePassword() {
    

    }

    @Then("user should see a message error")
    public void userShouldSeeAMessageError() {
    }


    @Then("user logs in with {string} and {string}")
   public void userLogsInWithAnd(String arg0, String arg1) {
   }
}
