package com.eurotech.step_definitions;

import com.eurotech.pages.ContactusPage;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactUs_Stepdefs {
    ContactusPage contactusPage = new ContactusPage();
    @Given("The User is on the contact us page")
    public void theUserIsOnTheContactUsPage() {
        String url = "https://automationexercise.com/contact_us";
        Driver.get().get(url);
    }
    @Then("The warning message contains{string}")
    public void theWarningMessageContainsMesaj() {
        String validationMessage = Driver.get().findElement(By.xpath("//input[@name='email']")).getAttribute("validationMessage");
        System.out.println("validationMessage = " + validationMessage);
        String expectedText = "Fülle dieses Feld aus.";
        String actualText=validationMessage;
        Assert.assertEquals(expectedText,actualText);
    }
    @When("The user logs in using {string} and{string}")
    public void theUserLogsInUsingAndAnd(String name, String eMail) throws InterruptedException {
        contactusPage.contactUsSubmit(name,eMail);
    }
}
