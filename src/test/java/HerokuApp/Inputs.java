package HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inputs extends HerokuApp {
    @BeforeMethod
    public void dropdownLink() {
        WebElement dropdownLink = driver.findElement(By.xpath
                ("//a[text()='Inputs']"));
        dropdownLink.click();
    }

    @Test
    public void inputText() {
        WebElement field = driver.findElement(By.xpath("//input[@type='number']"));
        String text = "hello";
        field.sendKeys(text);
    }

    @Test
    public void inputNumbers() {
        WebElement field = driver.findElement(By.xpath("//input[@type='number']"));
        field.sendKeys(Keys.ARROW_UP);
        field.sendKeys(Keys.ARROW_UP);
        field.sendKeys(Keys.ARROW_UP);
        field.sendKeys(Keys.ARROW_DOWN);
    }
}
