package com.tanya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.tanya.pages.Configuration.DEFAULT_WAIT;

public class LoginPage {
    private static final String url = "http://phptravels.net/admin";

    private By byEmail = By.name("email");
    private By byPassword = By.xpath("//input[@name='password']");
    private By byLogin = By.xpath("//button[@type='submit']");

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, DEFAULT_WAIT);
    }

    public void open() {
        driver.get(url);
    }

    public void typeEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail));
        driver.findElement(byEmail).sendKeys(email);
    }

    public void typePassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(byPassword));
        driver.findElement(byPassword).sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(byLogin));
        driver.findElement(byLogin).click();
    }
}
