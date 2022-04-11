package BaseSettings;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchBase {
    private static final SelenideElement placeholder = $(By.className("search2__input"));
    private static final SelenideElement searchButton = $(By.className("search2__button"));

    public static void searchBoxExist(){
        $(By.className("serp-header__main")).should(exist);
    }

    public static void request(String text){
        placeholder.$(By.cssSelector("input[placeholder]")).setValue(text);
    }

    public static void search(){
        searchButton.click();
    }

    public static void checkRequestText(String expectedText){
        Assert.assertEquals("Лошара",expectedText,placeholder.$(By.cssSelector("input[placeholder]")).getValue());
    }
}
