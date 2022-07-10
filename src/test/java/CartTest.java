import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCartAndBackToShop (){
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        cartPage.continueShopping();
        assertTrue(productsPage.getTitle().isDisplayed(), "User was not logged in");
    }
}
