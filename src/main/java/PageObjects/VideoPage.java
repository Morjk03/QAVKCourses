package PageObjects;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
public class VideoPage {
    private final SelenideElement FirstVideo = $(byClassName("js-video-card"));
    private final SelenideElement VideoLayer = $(byClassName("media-layer__video"));

    public VideoPage PlayFirstVideo(){
        FirstVideo.click();
        return this;
    }
    public  VideoPage VerifyVideoPlaying(){
        VideoLayer.should(exist);
        return this;
    }
}
