package org.example.pages;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    private final By TITLE = By.cssSelector(".title");
    private final String addToCartButton = "//div[text()='%s']/ancestor::div[@class='inventory_item']//button";

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "inventory.html");
    }

    public WebElement getTitle() {
        return driver.findElement(TITLE);
    }

    private final By cartXpath = By.xpath("//span[@class='shopping_cart_badge']");

    public void addToCart(String productName) {
        By fullLocator = By.xpath(String.format(addToCartButton, productName));
        driver.findElement(fullLocator).click();
    }

    public void goToCart() {
        driver.findElement(cartXpath).click();
    }
}
