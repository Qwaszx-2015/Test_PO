package com.Test_PO.ozon;

import com.Test_PO.ozon.listeners.TestListener;
import com.Test_PO.ozon.pages.CatalogDataProcessing;
import com.Test_PO.ozon.util.TestSetup;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class ChangeCityTest extends TestSetup {

    @Test
    public void secondTest() {
        CatalogDataProcessing catalog = new CatalogDataProcessing(driver, webDriverWait);
        catalog.clickCity();
        catalog.inputCity();
        catalog.checkCity();
    }
}