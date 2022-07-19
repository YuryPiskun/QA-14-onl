import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTest extends BaseTest {

    @Issue("SHRL-13")
    @TmsLink("DEMO-2")
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
