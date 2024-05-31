package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ParfumsPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Sonuçlarda Ara']")
    public WebElement searchBox;

    @FindBy(xpath = "//ul[@class='list-ul']/li")
    public List<WebElement> searchResults;



}
