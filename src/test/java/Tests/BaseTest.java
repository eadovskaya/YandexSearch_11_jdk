package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static BaseSettings.Login.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    String baseUrl = "https://yandex.ru/search";

    @BeforeClass
    public static void setUp() {
        //Configuration.driverManagerEnabled = false;
        //Configuration.remote = "http://localhost:4444/wd/hub";
    }

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
