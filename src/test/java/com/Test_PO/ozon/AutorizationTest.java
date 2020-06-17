package com.Test_PO.ozon;

import com.Test_PO.ozon.listeners.TestListener;
import com.Test_PO.ozon.pages.CatalogDataProcessing;
import com.Test_PO.ozon.util.TestSetup;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
Авторизоваться на сайте;
Проверить что на главной странице отображается логин;
Убедиться что кнопка “Войти в аккаунт” сменилась на “Мой профиль”;
 */
@Listeners({TestListener.class})
public class AutorizationTest extends TestSetup {

    @Test
    public void firstTest() {
        CatalogDataProcessing pageObjectMain = new CatalogDataProcessing(driver, webDriverWait);
        pageObjectMain.clickLogin();
        pageObjectMain.inputPhoneNumber();
        pageObjectMain.inputCode();
        pageObjectMain.checkSettings();
    }
}