package com.demoblazee.pages;

import com.demoblazee.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){


        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath="//a[.='Home']")
    public WebElement home;

    @FindBy(xpath="//a[.='Cart']")
    public WebElement cart;
}
