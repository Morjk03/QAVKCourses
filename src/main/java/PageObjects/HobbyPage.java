package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class HobbyPage {
    private final SelenideElement HobbyHeader = $(byClassName("hobby-header"));

    public HobbyPage VerifyHobbyPage(){
        HobbyHeader.should(exist);
        return this;
    }
}
