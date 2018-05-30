import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Item;
import pages.MainPage;
import pages.MensClothes;
import pages.MensShirts;
import utils.ScreenshotOnFailure;
import utils.SingletonChromeDriver;

import java.util.logging.Logger;

public class SecondTest {

    private static final WebDriver driver = SingletonChromeDriver.getInstance();

    private MainPage mainPage = new MainPage(driver);
    private MensClothes mensClothesPage = new MensClothes(driver);
    private MensShirts mensShirtsPage = new MensShirts(driver);
    private Item itemPage = new Item(driver);

    @Rule
    public ScreenshotOnFailure screenshotTestRule = new ScreenshotOnFailure(driver);

    @Before
    public void loadPage() {
        driver.get("https://ru.burberry.com/");
    }


    @Test
    public void goToMensClothes() throws Exception {
        mainPage.mensClothesButton.click();
        mensClothesPage.mensShirtsButton.click();
        mensShirtsPage.firstShirt.click();
        itemPage.submit.isDisplayed();
        itemPage.findInStore.isDisplayed();

    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

}
