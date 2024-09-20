import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;


public class TitleCheckTest {
    @Test
    void openEnterpriseTest() {

        open("https://github.com");
        // Наведение на меню "Solutions"
        $(byTagAndText("button", "Solutions")).hover();
        // Клик по "Enterprise" в появившемся подменю
        $(byTagAndText("a", "Enterprise")).click();
        // Ожидание появления заголовка страницы
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));

    }
}
