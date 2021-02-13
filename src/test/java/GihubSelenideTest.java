
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GihubSelenideTest {
    @Test
    void enableJUnit5InSoftAssertions() {
        open("https://github.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("ul.repo-list a").click();
        //вариант до правки $(".repo-list").$(byLinkText("selenide/selenide")).click();
        // вариант из лекции показался усложенным $$("ul.repo-list li").first().$("a").click();
        $("[data-content=Wiki]").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("body").shouldHave(text("JUnit5 extension - "));
    }
}
