package com.Test_PO.ozon.listeners;

import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Test_PO.ozon.util.TakeScreenshot;

public class DriverCommunication extends AbstractWebDriverEventListener {

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        TakeScreenshot.takeScreenshot();
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend){
        TakeScreenshot.takeScreenshot();
    }
}