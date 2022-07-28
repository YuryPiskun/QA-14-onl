import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {


    @Test(description = "")
    @Description("Проверка на вход с правильными данными")
    public void userShouldLoginWithCredentials() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.getTitle().isDisplayed(), "User was not logged in");
    }

    @Test
    public void passwordShouldBeRequiredForLogin() {
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(loginPage.getError(), "Epic sadface: Password is required", "The error is incorrect");
    }

    @Test
    public void userNameShouldBeRequiredForLogin() {
        loginPage.open();
        loginPage.login("", "11111");
        assertEquals(loginPage.getError(), "Epic sadface: Username is required", "The error is incorrect");
    }

    @Test
    public void userShouldNotBeLoggedInBeWithInvalidPassword() {
        loginPage.open();
        loginPage.login("standard_user", "11111");
        assertEquals(loginPage.getError(), "Epic sadface: Username and password do not match any user in this service",
                "The error is incorrect");
    }

    @Test(description = "")
    @Description("Тест сломан специально, чтобы увидеть скрин")
    public void userShouldNotBeLoggedInBeWithInvalidUserName(){
        loginPage.open();
        loginPage.login("11111", "secret_sauce");
        assertEquals(loginPage.getError(), "Epic sadface: !!!Username and password do not match any user in this service",
                "The error is incorrect");
    }
}
