import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void addProductToCartAndValidateProductName() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        Assert.assertEquals(cartPage.productNameInCart(), "Sauce Labs Backpack");
    }

    @Test
    public void addProductToCartAndValidateProductPrice() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        Assert.assertEquals(cartPage.productPriceInCart(), "$29.99");
    }

    @Test
    public void addProductToAndGoToCheckout(){
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        cartPage.goToCheckout();
        checkoutPage.fillCheckoutFields("Yury", "Piskun", "11111");
        Assert.assertEquals(checkoutPage.getFirstNameFieldValue(),"Yury");
    }
}

