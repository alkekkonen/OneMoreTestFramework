package uiLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class MensClothes extends HtmlElement {

    public MensClothes(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    @Name("MensShirts")
    @FindBy(css = "a[href='/men-shirts/']")
    private Button mensShirtsButton;

//    public void isMensShirtsButtonExists() {
//        mensShirtsButton.exists();
//    }

    public Button getMensShirtsButton() {
        return mensShirtsButton;
    }

}
