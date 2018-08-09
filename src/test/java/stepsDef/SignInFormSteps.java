package stepsDef;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import pages.SignInFormPage;

import static com.codeborne.selenide.Selenide.$;

public class SignInFormSteps {
    @Given("Login as user (.*) with password (.*)")
    public void loginAs(String name, String password) {
        new SignInFormPage().login(name, password);
        $(By.xpath("//*[.='Start a project']")).shouldBe(Condition.visible);
    }
}
