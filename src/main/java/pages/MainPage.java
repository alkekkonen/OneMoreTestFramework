package pages;

import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import lombok.Getter;


@Getter
@NoArgsConstructor
@Name("Main page")
public class MainPage extends HtmlElement {


    public MainPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

//    @Name("Mens")
    @FindBy(css = "a[href='/men/']")
    public Button mensClothesButton;



//    public MainPage click(Button button){
//        button.click();
//        return new MainPage();
//    }

//    public Button getMensClothesButton() {
//        return mensClothesButton;
//    }

//    public void clickToMens() {
//        mensClothesButton.click();
//    }



}
