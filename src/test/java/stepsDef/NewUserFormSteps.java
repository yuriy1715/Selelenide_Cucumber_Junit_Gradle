package stepsDef;

import com.codeborne.selenide.Condition.*;
import cucumber.api.java.en.Given;
import pages.NewUserFormPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NewUserFormSteps {
    @Given("Create new user name (.*) with password (.*) with email (.*)")
    public void loginAsValidUser(String name, String pass, String email) {
       new NewUserFormPage().login(name, pass, email);
       $("").shouldBe(visible);
    }

}