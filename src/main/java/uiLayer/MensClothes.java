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
    @FindBy(xpath = "//*[@id=\"landing-content-grid-asset-item-0\"]/div/div[1]/div[2]/div[1]/a")
    private Button mensShirtsButton;

//    public void isMensShirtsButtonExists() {
//        mensShirtsButton.exists();
//    }

    public Button getMensShirtsButton() {
        return mensShirtsButton;
    }

}
