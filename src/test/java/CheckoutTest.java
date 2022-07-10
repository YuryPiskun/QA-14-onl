import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{
    @Test
    public void addProductToCartAndGoToCheckout(){
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        cartPage.goToCheckout();
        checkoutPage.fillCheckoutFields("Yury", "Piskun", "11111");
        Assert.assertEquals(checkoutPage.getFirstNameFieldValue(),"Yury");
    }
}


