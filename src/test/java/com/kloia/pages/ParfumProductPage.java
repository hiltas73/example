package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParfumProductPage extends BasePage{

    @FindBy(id = "addToFavouriteWishListBtn")
    public WebElement addToFavoritesBtn;

    @FindBy(xpath = "//*[@class='toaster-sub-title']")
    public WebElement toasterTitle;

}
