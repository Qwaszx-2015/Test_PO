package com.Test_PO.ozon;

import com.Test_PO.ozon.pages.CartDataProcessing;
import com.Test_PO.ozon.pages.SqueezerDataProcessing;
import com.Test_PO.ozon.pages.CatalogDataProcessing;
import com.Test_PO.ozon.util.TestSetup;
import org.testng.annotations.Test;

public class AdjustPowerTest extends TestSetup {

    @Test
    public void fourthTest(){
        CatalogDataProcessing pageObjectMain = new CatalogDataProcessing(driver, webDriverWait);
        SqueezerDataProcessing squeezerDataProcessing = new SqueezerDataProcessing(driver, webDriverWait);
        CartDataProcessing cartDataProcessing = new CartDataProcessing(driver, webDriverWait);
        pageObjectMain.clickCatalog();
        pageObjectMain.clickAppliances();
        pageObjectMain.clickSqueezerLabel();
        squeezerDataProcessing.inputMinPrice();
        squeezerDataProcessing.checkRangeWithMinPrice();
        squeezerDataProcessing.inputMaxPrice();
        squeezerDataProcessing.checkRangeWithMinAndMaxPrice();
        squeezerDataProcessing.inputMinPower();
        squeezerDataProcessing.checkRangeWithMinPower();
        squeezerDataProcessing.sortingMin();
        squeezerDataProcessing.putJuicerPowerInCart();
        cartDataProcessing.checkSqueezerPrice();
    }
}
