import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Item;
import pages.MainPage;
import pages.MensClothes;
import pages.MensShirts;
import utils.ScreenshotOnFailure;
import utils.SingletonChromeDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

@RunWith(value = Parameterized.class)
public class FirstTest {

    private static final Logger logger = Logger.getLogger(FirstTest.class.getName());

    private static final WebDriver driver = SingletonChromeDriver.getInstance();

    private MainPage mainPage = new MainPage(driver);
    private static MensClothes mensClothesPage = new MensClothes(driver);

    private WebElement element;

        public FirstTest(WebElement element) {
        this.element = element;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Object[][] data = new Object[][]{
            {mensClothesPage.mensShirtsButton},
            {mensClothesPage.mensAccessoiresButton}
        };

        return Arrays.asList(data);
    };


    @Rule
    public ScreenshotOnFailure screenshotTestRule = new ScreenshotOnFailure(driver);

    @Before
    public void loadPage() {
        driver.get("https://ru.burberry.com/");
    }

    @Test
    public void objectArrayDisplayed() throws Exception {
        logger.info("Starting objectArrayDisplayed test");
        mainPage.mensClothesButton.click();
        element.isDisplayed();

    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

}
