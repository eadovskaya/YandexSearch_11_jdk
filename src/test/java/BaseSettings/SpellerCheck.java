package BaseSettings;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SpellerCheck {

    private static final SelenideElement misspeller = $(By.cssSelector("div[class='misspell__level']"));
    private static final SelenideElement misspellMessage = misspeller.$(By.cssSelector("div[class='misspell__message']"));

     public static void misspellCheckerExist(){
         misspeller.should(exist);
     }

    public static void checkCorrectedLetter(String letter){
        misspellMessage.$(By.cssSelector("span[class='misspell__error']")).shouldBe(text(letter));
    }

    public static void misspellMessageExist(){
         misspellMessage.should(exist);
    }

}
