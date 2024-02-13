package pages;

import pages.components.Locale;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import java.util.List;

public class LocalizationPage {
    public LocalizationPage openPage() {
        open("/");

        return this;
    }
    public LocalizationPage switchToLocale(Locale locale) {
        $$(".lang-switch span").find(text(locale.name())).click();

        return this;
    }

    public LocalizationPage assertTrue(List<String> buttons) {
        $$(".header__navbar .navbar__link").filter(visible).shouldHave(texts(buttons));

        return this;
    }
}
