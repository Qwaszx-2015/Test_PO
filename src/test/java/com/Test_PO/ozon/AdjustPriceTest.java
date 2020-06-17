package com.Test_PO.ozon;

import com.Test_PO.ozon.pages.CartDataProcessing;
import com.Test_PO.ozon.pages.SqueezerDataProcessing;
import com.Test_PO.ozon.pages.CatalogDataProcessing;
import com.Test_PO.ozon.util.TestSetup;
import org.testng.annotations.Test;

public class AdjustPriceTest extends TestSetup {

    @Test
    public void thirdTest(){
        CatalogDataProcessing catalog = new CatalogDataProcessing(driver, webDriverWait);
        SqueezerDataProcessing squeezer = new SqueezerDataProcessing(driver, webDriverWait);
        CartDataProcessing cartDataProcessing = new CartDataProcessing(driver, webDriverWait);
        catalog.clickCatalog();
        catalog.clickAppliances();
        catalog.clickSqueezerLabel();
        squeezer.inputMinPrice();
        squeezer.checkRangeWithMinPrice();
        squeezer.inputMaxPrice();
        squeezer.checkRangeWithMinAndMaxPrice();
        squeezer.sortingMin();
        squeezer.putJuicerInCart();
        cartDataProcessing.checkSqueezerPrice();
    }
}
