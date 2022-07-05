package HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown extends HerokuApp{
    @BeforeMethod
    public void dropdownLink(){
        WebElement dropdownLink = driver.findElement(By.xpath
                ("//a[text()='Dropdown']"));
        dropdownLink.click();
    }

    @Test
    public void validateDropdownList(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        List<WebElement> dropdownList = driver.findElements(By.xpath
                ("//select[@id='dropdown']//option[contains(text(),'Option')]"));
        Assert.assertEquals(dropdownList.size(),2);
    }

    @Test
    public void pickUpFirstItem(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        List<WebElement> dropdownList = driver.findElements(By.xpath
                ("//select[@id='dropdown']//option[contains(text(),'Option')]"));
        dropdownList.get(0).click();
        Assert.assertEquals(dropdownList.get(0).getAttribute("selected"), "true");
    }

    @Test
    public void pickUpSecondItem(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        List<WebElement> dropdownList = driver.findElements(By.xpath
                ("//select[@id='dropdown']//option[contains(text(),'Option')]"));
        dropdownList.get(1).click();
        Assert.assertEquals(dropdownList.get(1).getAttribute("selected"), "true");
    }
}
