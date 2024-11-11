package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBox extends baseclass{

    @Test
    public void check() throws InterruptedException {

        baseclass.intializer();
        baseclass.wait1("//li[@class='btn btn-light active']");
        driver.findElement(By.id("item-1")).click();
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
        boolean selected = driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isEnabled();
        Assert.assertTrue(selected);

    }
}
//span[@class='rct-checkbox']