package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.util.List;

public class MainPage extends BasePage {
    @AndroidFindBy(id = "com.trello:id/log_in_button")
    private MobileElement loginButton;
    @AndroidFindBy(id = "account-6214121b802e76007547d6f4")
    private MobileElement primaryUserAccountOption;
    @AndroidFindBy(id = "com.trello:id/board_row_view")
    private List<MobileElement> boardList;
    @AndroidFindBy(id = "com.trello:id/notification_bell")
    private MobileElement notificationBell;

    public MainPage loginByDefaultAccount() {
        loginButton.click();
        primaryUserAccountOption.click();
        return this;
    }

    public MainPage isUserAuthorised() {
        Assert.assertTrue(notificationBell.isDisplayed());
        return this;
    }

    public MainPage openFirstExistingBoard() {
        boardList.get(0).click();
        return this;
    }
}
