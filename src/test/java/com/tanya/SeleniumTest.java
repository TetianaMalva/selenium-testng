package com.tanya;

import com.tanya.pages.DashBoardPage;
import com.tanya.pages.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    private FirefoxDriver driver;
    private LoginPage loginPage;
    private DashBoardPage dashBoardPage;

    @BeforeClass
    public void startBrowser() {
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        dashBoardPage = new DashBoardPage(driver);
    }

    @Test
    public void phpTravelsAdminTest() {
        loginPage.open();
        loginPage.typeEmail("admin@phptravels.com");
        loginPage.typePassword("demoadmin");
        loginPage.clickLoginButton();
        boolean isDashboardDisplayed = dashBoardPage.isDashboardDisplayed();
        Assert.assertTrue(isDashboardDisplayed, "Dashboard is not displayed");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
