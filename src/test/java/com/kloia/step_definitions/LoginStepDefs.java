package com.kloia.step_definitions;

import com.kloia.pages.LoginPage;
import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user navigate to the URL")
    public void the_user_navigate_to_the_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.girisYapBtn.click();
    }
    @When("the user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String email, String password) {
        loginPage.loginWithValidCredentials(email, password);
    }
    @Then("the user should verify the home page")
    public void the_user_should_verify_the_home_page() {
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        String actualTitle = Driver.getDriver().getTitle();

        assertEquals("Successful Login Test",expectedTitle,actualTitle);
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginButton.click();

    }
    @Then("the user should see {string}")
    public void the_user_should_see(String errorMessage) {
        assertEquals("Login error message test", errorMessage, loginPage.errorMessage.getText());
    }

}
