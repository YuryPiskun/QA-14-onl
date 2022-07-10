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
}

