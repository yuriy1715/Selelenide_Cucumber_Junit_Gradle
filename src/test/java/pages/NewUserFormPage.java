package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewUserFormPage extends BasePage{
    SelenideElement user = $(By.xpath("//*[@id = 'user[login]']")),
                    email = $(By.xpath("//*[@id = 'user[email]']")),
                    password = $(By.xpath("//*[@id = 'user[password]']")),
                    buttonSignUp = $(By.xpath("//*[@class='form-control-note mb-0 text-center']/preceding-sibling::*[1]"));

    public void login(String name, String pass, String mail) {
        user.sendKeys(name);
        email.sendKeys(mail);
        password.sendKeys(pass);
        buttonSignUp.click();
    }

}
