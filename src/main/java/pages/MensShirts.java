package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.List;

@Getter
public class MensShirts extends HtmlElement {

    public MensShirts(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

//    @Name("Item")
    @FindBy(css = "col-lg-3 col-md-3")
    public List<Button> shirtsList;

//    @Name("First item")
    @FindBy(xpath = "//*[@id=\"facet-result-render\"]/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/p/a")
    public Button firstShirt;


//    public void isMensShirtsButtonExists() {
//        mensShirtsButton.exists();
//    }

//    public List<Button> getShirtButtons() {
//        return shirtsList;
//    }
//
//    public Button getFirstShirt() {
//        return firstShirt;
//    }
}
