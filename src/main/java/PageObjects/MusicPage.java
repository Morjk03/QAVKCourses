package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.title;

//Здесь я не уверен что стоит создавать новый Page т.к мы не переходим с других страниц,
// но с другой стороны это что-то вроде новой страницы
public class MusicPage {
    private SelenideElement PlayMusicButton = $(byXpath("//*[@id=\"music_layer\"]/header/wm-player/wm-player-controls/button[2]"));
    private SelenideElement StopMusicButton = $(byTitle("Пауза"));

    public MusicPage PlayMusic(){
        PlayMusicButton.click();
        sleep(5000);
        return this;
    }
    public MusicPage VerifyMusicPlaying(){
        StopMusicButton.should(exist);
        return this;
    }



}
