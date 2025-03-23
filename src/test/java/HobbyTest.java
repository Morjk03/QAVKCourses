import PageObjects.HobbyPage;
import PageObjects.UserMainPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class HobbyTest extends LoginClass {
    @Test
    void HobbyTest() {
        UserMainPage userMainPage = LoginCorrectData();
        HobbyPage hobbyPage = userMainPage.GoToHobby();
        hobbyPage.VerifyHobbyPage();
    }
}
