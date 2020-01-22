//сторінка залогінення
package com.rozetka.qa.pages;

import com.rozetka.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //Page factory -Object Repository
    @FindBy(xpath = "//span[@class='exponea-close-cross']")
    WebElement banner;

    @FindBy(id = "auth_email")
    WebElement username;

    @FindBy(id = "auth_pass")
    WebElement password;

    @FindBy(xpath = "//a[contains(@class,'header-topline__user-link')]")
    WebElement login_btn;

    @FindBy(xpath = "//button[contains(@class,'auth-modal__submit')]")
    WebElement verify_login_btn;

    //Init page Objects
    public LoginPage() {
        PageFactory.initElements(driver, this);//from Base Class.(this)All variables init with driver
    }

    //Actions
    public String validateLogPageTitle() {
        return driver.getTitle();
    }


    public HomePage login(String usr_name, String pswd) {

        banner.click();
        username.sendKeys(usr_name);
        password.sendKeys(pswd);
        login_btn.click();
        verify_login_btn.click();

        return new HomePage();
    }


}
