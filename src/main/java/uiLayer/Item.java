package uiLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.List;

public class Item extends HtmlElement {

    public Item(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }


//  @Name("Submit")
    @FindBy(css = "submit__unlinked")
    private Button submit;

//  @Name("Find")
    @FindBy(css = ".find-in-store-block")
    private Button findInStore;



    public Button getSubmit() {
        return submit;
    }

    public Button getFindInStore() {
        return findInStore;
    }
}
