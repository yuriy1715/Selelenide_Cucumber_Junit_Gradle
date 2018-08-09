package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    SelenideElement headerChooseSignIn = $(By.xpath("//*[@class='HeaderNavlink px-0 py-2 m-0']//*[.='Sign in']")),
                    headerSighUp = $(By.xpath("//*[@class='HeaderNavlink px-0 py-2 m-0']//*[.='Sign up']"));

    public void clickOnSignIn() {
        headerChooseSignIn.click();
    }

    public void clickOnSignUn() {
        headerSighUp.click();
    }

}
