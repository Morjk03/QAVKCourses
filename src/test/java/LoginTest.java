import org.junit.jupiter.api.Test;
import  PageObjects.*;

public class LoginTest extends LoginClass {
    private final String UserNameAndSurname=("Тимур Ниязгулов");
    @Test
    void LoginTestCorrectData(){
        UserMainPage userMainPage = LoginCorrectData();
        userMainPage.VerifeUserNameandSurname(UserNameAndSurname);
        userMainPage.VerifyFeedisExisting();
    }


}
