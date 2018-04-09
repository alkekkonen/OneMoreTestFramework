import businessLayer.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uiLayer.Item;
import uiLayer.MainPage;
import uiLayer.MensClothes;
import uiLayer.MensShirts;

public class FirstTest {

    private static WebDriver driver = new ChromeDriver();
    private MainPage mainPage = new MainPage(driver);
    private MensClothes mensClothesPage = new MensClothes(driver);
    private MensShirts mensShirtsPage = new MensShirts(driver);
    private Item itemPage = new Item(driver);
//    Actions actions = new Actions();

    @Before
    public void loadPage() {
        driver.get("https://ru.burberry.com/");
    }

    @Test
    public void goToMensClothes() throws Exception {
        Actions.click(mainPage.getMensClothesButton());
        Actions.click(mensClothesPage.getMensShirtsButton());
        Actions.click(mensShirtsPage.getFirstShirt());
        Actions.isAppeared(itemPage.getSubmit());
        Actions.isAppeared(itemPage.getFindInStore());



//        mensClothesPage.isMensShirtsButtonExists();


    }


    @After
    public void closeDriver() {
        driver.quit();
    }

}
