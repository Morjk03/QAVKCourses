
package PageObjects;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement LoginField = $(byXpath("//*[@id=\"field_email\"]"));
    private final SelenideElement PasswordField = $(byXpath("//*[@id=\"field_password\"]"));
   // private final SelenideElement LoginButton = $(By.xpath("///*[@id=\"tabpanel-login-1855353235\"]/form/div[4]/input")); XPath перестал работать
   private final SelenideElement LoginButton = $(byValue("Войти в Одноклассники"));

    public  LoginPage SetValueLoginField(String login){
        LoginField.setValue(login);
        return this;
    }
    public LoginPage SetValuePasswordField(String password){
        PasswordField.setValue(password);
        return this;
    }
    public  UserMainPage ClickToLoginButton(){
        LoginButton.click();
        return new UserMainPage();
    }
}
