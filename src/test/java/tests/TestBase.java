package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.LocalizationPage;
import pages.RegistrationPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    LocalizationPage localizationPage = new LocalizationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://easymarkets.com.ua";
        Configuration.browserSize = "1366x768";
    }
}
