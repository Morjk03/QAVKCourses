import  PageObjects.*;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
public class LikeTest extends LoginClass {
    @Test
    void LikeTest(){
        UserMainPage userMainPage = LoginCorrectData();
        userMainPage.LikeFirsPost();
        userMainPage.VerifeLikeActive();

    }

}
