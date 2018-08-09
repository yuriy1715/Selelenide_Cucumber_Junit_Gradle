package stepsDef;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.Given;
import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {
    @Given("an open browser on the page (.*)")
    public void an_open_browser_onThePage(String page) {
        open(page);
        $(".application-main ").shouldBe(visible);
    }

    @Given("open Sign In form")
    public void openSignInForm() {
        new BasePage().clickOnSignIn();
        $(".auth-form-body").shouldBe(visible);
    }

    @Given("open Sign Up form")
    public void openSignUpForm() {
        new BasePage().clickOnSignUn();
        $(".setup-main").shouldBe(visible);
    }
}
