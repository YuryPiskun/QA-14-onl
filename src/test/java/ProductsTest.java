import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Issue("SHRL-18")
    @TmsLink("DEMO-1")
    @Link("https://github.com/YuryPiskun")
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

