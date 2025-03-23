import  PageObjects.*;
import org.junit.jupiter.api.Test;

public class VideoTest extends LoginClass {
    @Test
    void VideoTest() {
        UserMainPage userMainPage = LoginCorrectData();
        VideoPage videoPage = userMainPage.GoToVideo();
        videoPage.PlayFirstVideo();
        videoPage.VerifyVideoPlaying();
    }
}