import businessLayer.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uiLayer.MainPage;
import uiLayer.MensClothes;

public class FirstTest {

    private WebDriver driver = new ChromeDriver();
    private MainPage mainPage = new MainPage(driver);
    private MensClothes mensClothesPage = new MensClothes(driver);
    Actions actions = new Actions();

    @Before
    public void loadPage() {
        driver.get("https://ru.burberry.com/");
    }

    @Test
    public void goToMensClothes() throws Exception {
        actions.click(mainPage.getMensClothesButton());
        actions.click(mensClothesPage.getMensShirtsButton());

//        mainPage.clickToMens();
////        driver.wait(1000);
//        mensClothesPage.isMensShirtsButtonExists();


    }


    @After
    public void closeDriver() {
        driver.quit();
    }

}
