package tests;

import org.junit.jupiter.api.*;

import static util.RandomUtils.*;

public class RegistrationTests extends TestBase {
    String lastName = getRandomString(9);
    String firstName = getRandomString(8);
    String patronymic = getRandomString(8);
    String email = getRandomEmail();
    String password = getRandomPassword();
    String phone = getRandomPhone();

    @DisplayName("")
    @Test
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
    void registrationTest() {
        registrationPage.openPage()
                .clickDemoVersionButton()
                .shouldHaveHeroBanner(TestData.headerOnHomePage)
                .setEmail(email)
                .setLastName(lastName)
                .setFirstName(firstName)
                .setPatronymic(patronymic)
                .setPhone(phone)
                .setFirstPassword(password)
                .setLastPassword(password)
                .clickButtonCreateNewAccount()
                .shouldHaveCreatePassword();


    }

}
