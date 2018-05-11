package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class Item extends HtmlElement {

    public Item(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }


    //  @Name("Submit")
//    @FindBy(css = "submit__unlinked")
    @FindBy(xpath = "//*[text()='В корзину']")
    public Button submit;

    //  @Name("Find")
    @FindBy(css = ".find-in-store-block")
    public Button findInStore;


//    public Button getSubmit() {
//        return submit;
//    }
//
//    public Button getFindInStore() {
//        return findInStore;
//    }
}
