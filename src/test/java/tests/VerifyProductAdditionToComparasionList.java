package tests;

import org.testng.annotations.Test;
import pages.ComparasionListPage;
import pages.MainPage;

public class VerifyProductAdditionToComparasionList extends MainPage {

    @Test
    public void testProductAdditionToTheList(){
        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .addItemToComparasionList()
                .closePopUpWindow()
                .openComparasionListPage();
    }
}
