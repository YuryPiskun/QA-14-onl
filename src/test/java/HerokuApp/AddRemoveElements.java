package HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElements extends HerokuApp {

    @BeforeMethod
    public void AddRemoveElementsLink() {
        WebElement addRemoveElementsLink = driver.findElement(By.xpath
                ("//a[text()='Add/Remove Elements']"));
        addRemoveElementsLink.click();
    }

    @Test
    public void AddFirstElement() {
        WebElement addElementButton = driver.findElement(By.xpath
                ("//button[text()='Add Element']"));
        addElementButton.click();
        Assert.assertTrue(driver.findElement(By.xpath("//button[1][text()='Delete']"))
                .isDisplayed());
    }

    @Test
    public void AddSecondElement() {
        WebElement addElementButton = driver.findElement(By.xpath
                ("//button[text()='Add Element']"));
        addElementButton.click();
        addElementButton.click();
        Assert.assertTrue(driver.findElement(By.xpath("//button[2][text()='Delete']"))
                .isDisplayed());
    }

    @Test
    public void DeleteElement() {
        WebElement addElementButton = driver.findElement(By.xpath
                ("//button[text()='Add Element']"));
        addElementButton.click();
        addElementButton.click();
        WebElement deleteButton = driver.findElement(By.xpath
                ("//button[1][text()='Delete']"));
        deleteButton.click();
        Assert.assertTrue(driver.findElement(By.xpath
                ("//button[1][text()='Delete']")).isDisplayed());
    }

    @Test
    public void CountOfElements() {
        WebElement addElementButton = driver.findElement(By.xpath
                ("//button[text()='Add Element']"));
        addElementButton.click();
        addElementButton.click();
        WebElement deleteButton = driver.findElement(By.xpath
                ("//button[1][text()='Delete']"));
        deleteButton.click();
        List<WebElement> count = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(count.size(), 1);
    }


}
