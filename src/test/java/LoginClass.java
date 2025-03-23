import com.codeborne.selenide.Selenide;
import  PageObjects.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

//Чтобы избежать дублирование кода для авторизации я решил вынести все это в отдельный класс

public class LoginClass {
    private final String Login = "+79870582512"; //Пожалуйста не крадите мой аккаунт в Одноклассниках
    private final String Password = "*v-g,ULwyX#j5yK";
    protected UserMainPage LoginCorrectData() {
        Selenide.open("https://ok.ru");
        LoginPage loginPage = new LoginPage();
        loginPage.SetValueLoginField(Login);
        loginPage.SetValuePasswordField(Password);
        UserMainPage userMainPage = loginPage.ClickToLoginButton();
        return userMainPage;
    }
    //Это я добавил чтобы при запуске серии тестов они все не падали
    @AfterAll
    static void CloseBrowser(){
        Selenide.closeWebDriver();
    }
}
