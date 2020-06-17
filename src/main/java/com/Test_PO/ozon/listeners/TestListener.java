package com.Test_PO.ozon.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.Test_PO.ozon.util.TakeScreenshot;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result){
        TakeScreenshot.takeScreenshot();
    }
}