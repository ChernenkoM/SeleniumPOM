package com.rozetka.qa.testCases;

import com.rozetka.qa.base.TestBase;
import com.rozetka.qa.pages.HomePage;
import com.rozetka.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;


    public LoginPageTest(){
       super();
    }


    @BeforeMethod
    public void setUp(){
        initialisation();
        loginPage = new LoginPage();
    }

    @Test(priority =  1)
    public void first_page_test() {
        String title = loginPage.validateLogPageTitle();
        Assert.assertEquals(title, "Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине");
    }

    @Test(priority = 2)//добавити метод для клікy по формі реєстрації
    public void login_test() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }


    @AfterMethod
    public void close_up() {

        driver.quit();
    }

}





