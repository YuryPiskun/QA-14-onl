package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    private final By checkoutButton = By.id("checkout");
    private final By continueShoppingButton = By.id("continue-shopping");

    public String productNameInCart() {
        WebElement productName = driver.findElement(By.className("inventory_item_name"));
        return productName.getText();
    }

    public String productPriceInCart() {
        WebElement productPrice = driver.findElement(By.className("inventory_item_price"));
        return productPrice.getText();
    }

    public void goToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
