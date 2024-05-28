package com.kloia.pages;

import com.kloia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Giriş Yap']")
    public WebElement girisYapBtn;

    @FindBy(xpath = "//a[@title='Kozmetik & Kişisel Bakım']")
    public WebElement kozmetikMenuBtn;

    @FindBy(xpath = "//a[@title='Parfüm & Deodorant']")
    public WebElement parfumDeodorantMenuBtn;

}
