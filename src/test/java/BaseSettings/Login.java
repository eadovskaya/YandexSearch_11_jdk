package BaseSettings;

import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    private static final String authorizationTab = "//div[@class='serp-header__nav']";
    private static final String login = "//a[contains(@class,'serp-user__login-link')]";
    private static final String registration = "//a[contains(@class,'serp-user__registration-button')]";
    private static final SelenideElement loginButton = $(By.xpath(authorizationTab + login));
    private static final SelenideElement registrationButton = $(By.xpath(authorizationTab + registration));

    public static void loginButtonExist(){
        loginButton.should(exist);
    }

    public static void loginButtonClick(){
        loginButton.click();
    }

    public static void registrationButtonExist(){
        registrationButton.should(exist);
    }

    public static void registrationButtonClick(){
        registrationButton.click();
    }

    public static void checkAuthPage(){
       String currentUrl = WebDriverRunner.currentFrameUrl();
       Assert.assertTrue(currentUrl.contains("passport.yandex.ru/auth/"));
    }

    public static void checkRegistrationPage(){
        String currentUrl = WebDriverRunner.currentFrameUrl();
        Assert.assertTrue(currentUrl.contains("passport.yandex.ru/registration"));
    }
}
