package pages;

import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    public RegistrationPage openPage() {
        open("/en/");

        return this;
    }

    public RegistrationPage clickDemoVersionButton() {
        $("div[class='header__buttons'] button[class='button button-enter menu__button']").click();

        return this;
    }
    public RegistrationPage shouldHaveHeroBanner(String headerOnHomePage) {
        $(".form__header").shouldHave(text(headerOnHomePage));

        return this;
    }

    public RegistrationPage setEmail(String email) {
        $("[data-qa_id='email']").setValue(email);

        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        $("[data-qa_id='lastName']").setValue(lastName);

        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        $("[data-qa_id='firstName']").setValue(firstName);

        return this;
    }

    public RegistrationPage setPatronymic(String patronymic) {
        $("[data-qa_id='patronymic']").setValue(patronymic);

        return this;
    }

    public RegistrationPage setPhone(String fone) {
        $("[placeholder='Ukraine (Україна)']").setValue(fone);

        return this;
    }
    public RegistrationPage setFirstPassword(String password) {
        $("[data-qa_id='password']").setValue(password);

        return this;
    }

    public RegistrationPage setLastPassword(String password) {
        $("[data-qa_id='confirmPassword']").setValue(password);

        return this;
    }

    public RegistrationPage clickButtonCreateNewAccount() {
        $("[data-qa_id='submit_btn']").click();

        return this;
    }

    public RegistrationPage shouldHaveCreatePassword() {
        $("[data-qa_id='repeated_request']").shouldHave(text("Send the registration request again"));

        return this;
    }
//
//    public RegistrationPage verifyResultsModalAppears() {
//        registrationResultsModal.verifyModalAppears();
//
//        return this;
//    }

}
