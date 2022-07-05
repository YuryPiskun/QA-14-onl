package HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Typos extends HerokuApp{
    @BeforeMethod
    public void dropdownLink() {
        WebElement dropdownLink = driver.findElement(By.xpath
                ("//a[text()='Typos']"));
        dropdownLink.click();
    }
    @Test
    public void checkText(){
        List<WebElement> pageText = driver.findElements(By.tagName("p"));
        Assert.assertEquals(pageText.get(1).getText(),"Sometimes you'll see a typo, other times you won't.");
    }
}
