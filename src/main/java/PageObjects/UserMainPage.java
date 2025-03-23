package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class UserMainPage {
    // Селекторы для проверки логина
    //private final SelenideElement FeedList = $(By.xpath("//*[@id=\"hook_Loader_3740137856\"]/div[1]")); XPath перестал работать
    private final SelenideElement FeedList = $(By.id("hook_Block_MainFeedsNewFeed"));
    private final SelenideElement UserNameAndSurname = $(By.xpath("//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a/div"));

    //Селекторы для проверки лайка
    private final SelenideElement LikeButton = $(byClassName("js-klass-action"));
    private final SelenideElement LikeActive = $(byAttribute("data-react-icon","like"));

    //Селектор для перехода в видео
    private final SelenideElement GoToVideoButton = $(byClassName("toolbar_nav_a__video"));

    //Селектор для перехода в музыку
    private final SelenideElement GoToMusicButton = $(byClassName("toolbar_music-container"));

    //Селектор для перехода в хобби
    private final SelenideElement GoToHobbyButton = $(byClassName("content__aj603"));

    public UserMainPage VerifeUserNameandSurname(String ExpectedName){
        UserNameAndSurname.shouldHave(exactText(ExpectedName));
        return this;
    }
    public  UserMainPage VerifyFeedisExisting(){
        FeedList.should(exist);
        return this;
    }
    public UserMainPage LikeFirsPost(){
        LikeButton.click();
        return this;
    }
    public UserMainPage VerifeLikeActive(){
        LikeActive.should(exist);
        return this;
    }
    public  VideoPage GoToVideo(){
        GoToVideoButton.click();
        return  new VideoPage();
    }
    public MusicPage GoToMusic(){
        GoToMusicButton.click();
        return new MusicPage();
    }
    public HobbyPage GoToHobby(){
        GoToHobbyButton.click();
        return new HobbyPage();
    }
}
