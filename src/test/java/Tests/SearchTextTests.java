package Tests;

import org.junit.Test;

import static BaseSettings.SearchBase.*;
import static BaseSettings.SpellerCheck.*;
import static com.codeborne.selenide.Selenide.open;

public class SearchTextTests extends BaseTest {

    @Test
    public void Search(){
        String requestedText = "котики";

        open(baseUrl);
        searchBoxExist();
        request(requestedText);
        search();
        checkRequestText(requestedText);
    }

    @Test
    public void SpellChecker(){
        String requestedText = "кaтики";

        open(baseUrl);
        searchBoxExist();
        request(requestedText);
        search();
        misspellCheckerExist();
        checkCorrectedLetter("о");
    }
}
