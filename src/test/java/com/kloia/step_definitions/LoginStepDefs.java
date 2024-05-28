package com.kloia.step_definitions;

import com.kloia.pages.LoginPage;
import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

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
        //System.out.println("Title = " + Driver.getDriver().getTitle());
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Successful Login Test",expectedTitle,actualTitle);
    }

}
