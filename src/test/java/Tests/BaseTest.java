package Tests;

import org.junit.Test;

import static BaseSettings.Login.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    String baseUrl = "https://yandex.ru/search";

    @Test
    public void Auth(){
        // TODO: github - готово
        // TODO: remote chrome driver

        open(baseUrl);
        loginButtonExist();
        loginButtonClick();
        //checkAuthPage();
    }
}
