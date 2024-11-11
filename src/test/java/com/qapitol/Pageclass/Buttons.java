package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Buttons extends baseclass {
    @Test
    public void Action() throws InterruptedException {
        baseclass.intializer();
        baseclass.scroll(0,200);
        driver.findElement(By.id("item-4")).click();

        baseclass.scroll(0,200);
        baseclass.wait1("//div[@class='header-wrapper']");


        Actions act=new Actions(driver);
        WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        act.doubleClick(doubleclick).build().perform();
        WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightclick).build().perform();
        WebElement click= driver.findElement(By.xpath("//button[@class='btn btn-primary'][.='Click Me']"));
        act.click(click).build().perform();





    }
}
