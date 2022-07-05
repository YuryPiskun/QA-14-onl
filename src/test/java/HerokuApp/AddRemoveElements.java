package HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElements extends HerokuApp {

    @BeforeMethod
    public void addRemoveElementsLink() {
        WebElement addRemoveElementsLink = driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));
        addRemoveElementsLink.click();
    }

    @Test
    public void addFirstElement() {
        WebElement addElementButton = driver.findElement(By.xpath
                ("//button[text()='Add Element']"));
        addElementButton.click();
        List<WebElement> deleteElementButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertTrue(deleteElementButtons.get(0).isDisplayed());
    }

    @Test
    public void addSecondElement() {
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();
        addElementButton.click();
        List<WebElement> deleteElementButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertTrue(deleteElementButtons.get(1).isDisplayed());
    }

    @Test
    public void deleteElement() {
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();
        addElementButton.click();
        List<WebElement> deleteElementButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        deleteElementButtons.get(0).click();
        Assert.assertTrue(deleteElementButtons.get(1).isDisplayed());
    }

    @Test
    public void countOfElements() {
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();
        addElementButton.click();
        List<WebElement> deleteElementButtons = driver.findElements(By.xpath("//button[text()='Delete']"));
        deleteElementButtons.get(0).click();
        List<WebElement> count = driver.findElements(By.xpath("//button[text()='Delete']"));
        Assert.assertEquals(count.size(), 1);
    }
}
