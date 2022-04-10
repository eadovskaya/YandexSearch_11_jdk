package BaseSettings;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchBase {

    public static void searchBoxExist(){
        $(By.className("serp-header__main")).should(exist);
    }

    public static void search(String text){
        $(By.className("")).setValue(text);
    }
}
