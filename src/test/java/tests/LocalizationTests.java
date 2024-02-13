package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.components.Locale;

import java.util.List;
import java.util.stream.Stream;


public class LocalizationTests extends TestBase {

    static Stream<Arguments> siteShoutContainAllOfButtonsForGivenLocale() {
        return Stream.of(
                Arguments.of(Locale.Eng, List.of("Features", "Tariffs", "Presentation", "Cases", "Help", "Contacts")),
                Arguments.of(Locale.Ukr, List.of("Можливості", "Тарифи", "Презентація", "Кейси", "Допомога", "Контакти"))
        );
    }


    @MethodSource
    @ParameterizedTest(name = "для локали {0} отображаются кнопки {1}")
    @Tag("BLOCKER")
    void siteShoutContainAllOfButtonsForGivenLocale(Locale locale, List<String> buttons) {
        localizationPage.openPage()
                .switchToLocale(locale)
                .assertTrue(buttons);
    }

}
