package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static BaseSettings.Login.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    String baseUrl = "https://yandex.ru/search";

    @BeforeClass
    public static void setUp() {
        Configuration.driverManagerEnabled = false;

        // local:  http://localhost:4444/wd/hub
        // docker: http://host.docker.internal:4444/wd/hub
        Configuration.remote = System.getenv("SELENIDE_REMOTE");
    }

    @AfterClass
    public static void cleanUp(){
        closeWebDriver();
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
