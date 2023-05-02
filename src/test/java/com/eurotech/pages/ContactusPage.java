package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {

    public ContactusPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameInput;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement eMailInput;
    @FindBy(xpath = "//*[@name='subject']")
    public WebElement subjectInput;
    @FindBy(id = "message")
    public WebElement yourMessageInput;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitBtn;

    public void contactUsSubmit(String name,String eMail) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        nameInput.sendKeys(name);
        eMailInput.sendKeys(eMail);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,300)");
        submitBtn.click();

    }

}
