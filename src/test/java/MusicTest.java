import  PageObjects.*;
import org.junit.jupiter.api.Test;

public class MusicTest extends LoginClass {


    @Test
    void MusicTest()  {
        UserMainPage userMainPage = LoginCorrectData();
        MusicPage musicPage = userMainPage.GoToMusic();
        musicPage.PlayMusic();
        musicPage.VerifyMusicPlaying();
    }
}