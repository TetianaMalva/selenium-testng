package com.tanya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.tanya.pages.Configuration.DEFAULT_WAIT;

public class DashBoardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By byDashboard = By.xpath("//*[@class='navbar-header']/a/span");

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, DEFAULT_WAIT);
    }


    public boolean isDashboardDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(byDashboard));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
