package main;

import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest {
    @Test
    public void loginByPrimaryCredentials(){
        MainPage mainPage = new MainPage();
        mainPage
                .loginByDefaultAccount()
                .isUserAuthorised();
    }
}
