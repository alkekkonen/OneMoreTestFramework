package businessLayer;

import ru.yandex.qatools.htmlelements.element.Button;

import java.util.List;

public class Actions {

    public static void click(Button button){
        button.click();

    }

    public static void isAppeared(Button button){
        button.exists();
    }

    public static void findFirst (List<Button> buttonsList){
        buttonsList.get(0).click();

    }

}
