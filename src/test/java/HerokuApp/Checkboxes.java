package HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes extends HerokuApp {

    @BeforeMethod
    public void CheckboxesLink() {
        WebElement checkboxesLink = driver.findElement(By.xpath
                ("//a[text()='Checkboxes']"));
        checkboxesLink.click();
    }

    @Test
    public void ValidateFirstCheckbox() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        Assert.assertNotEquals(checkboxes.get(0).getAttribute("checked"), "true");
    }

    @Test
    public void PickUpFirstCheckbox() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        checkboxes.get(0).click();
        Assert.assertEquals(checkboxes.get(0).getAttribute("checked"), "true");
    }

    @Test
    public void ValidateSecondCheckbox() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        Assert.assertEquals(checkboxes.get(1).getAttribute("checked"), "true");
    }

    @Test
    public void UncheckSecondCheckbox() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        checkboxes.get(1).click();
        Assert.assertNotEquals(checkboxes.get(1).getAttribute("checked"), "true");
    }
}
