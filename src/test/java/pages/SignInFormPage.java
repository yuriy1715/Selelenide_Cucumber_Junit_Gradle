package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInFormPage extends BasePage{
    SelenideElement login = $("#login_field"),
                    password = $("#password"),
                    submit = $("[type=Submit]");

    public void login(String name, String passw) {
        login.sendKeys(name);
        password.sendKeys(passw);
        submit.click();
    }
}
