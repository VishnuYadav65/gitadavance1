package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends baseclass{


@Test
    public void Button(){

        baseclass.intializer();

        driver.findElement(By.id("item-2")).click();

        baseclass.scroll(0,200);
        wait1("//label[@for='yesRadio']");
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        boolean Selected = driver.findElement(By.xpath("//input[@id='yesRadio']")).isEnabled();
        Assert.assertTrue(Selected);

        //by using softassertion I can test radio buttons vice versa

        if (Selected=true){
            boolean impressiveradio = driver.findElement(By.id("impressiveRadio")).isSelected();
            Assert.assertFalse(impressiveradio);

        }
        baseclass.teardown();


    }
}
