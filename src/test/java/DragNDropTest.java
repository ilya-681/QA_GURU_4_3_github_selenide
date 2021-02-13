import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.*;

public class DragNDropTest {

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveByOffset(150, 10).release().perform();
        //assert
        $("#column-b").shouldHave(Condition.text("A"));
    }
}
