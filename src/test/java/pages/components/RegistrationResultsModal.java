package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {
    public void verifyModalAppears() {
        String testText = "Войдите в аккаунт и сэкономьте";
        $(byText("Войдите в аккаунт и сэкономьте")).shouldHave(text(testText));
        $("button[aria-label='Скрыть меню входа в аккаунт.']").click();
    }


}
