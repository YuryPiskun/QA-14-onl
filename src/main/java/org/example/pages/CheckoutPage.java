package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private final By firstNameField = By.id("first-name");

    private final By lastNameField = By.id("last-name");
    private final By zipCodeField = By.id("postal-code");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckoutFields(String firstName, String lastName, String zipCode) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }
    public String getFirstNameFieldValue(){
        return driver.findElement(firstNameField).getAttribute("value");
    }
}
