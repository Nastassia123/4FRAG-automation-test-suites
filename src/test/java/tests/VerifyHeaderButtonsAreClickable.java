package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class VerifyHeaderButtonsAreClickable extends MainPage {

    @Test
    public void testLoginButtonIsClickable(){
        LoginPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage();

    }

    @Test
    public void testDeliveryButtonIsClickable(){
        DeliveryPage deliveryPage = new MainPage()
                .openHomePage()
                .openDeliveryPage();

    }

    @Test
    public void testPaymentButtonIsClickable(){
        PaymentPage paymentPage = new MainPage()
                .openHomePage()
                .openPaymentPage();

    }

    @Test
    public void testDiscountSystemButtonIsClickable(){
        DiscountSystemPage discountSystemPage = new MainPage()
                .openHomePage()
                .openDiscountSystemPage();

    }

    @Test
    public void testWarrantyButtonIsClickable(){
        WarrantyPage warrantyPage = new MainPage()
                .openHomePage()
                .openWarrantyPage();

    }

    @Test
    public void testBookmarksButtonIsClickable(){
        BookmarksPage bookmarksPage = new MainPage()
                .openHomePage()
                .openBookmarksPage();

    }

    @Test
    public void testComparasionOfProductsButtonIsClickable(){
        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .openComparasionListPage();

    }

    @Test
    public void testBasketButtonIsClickable(){
         BasketPage basketPage = new MainPage()
                .openHomePage()
                .openBasketPage();
        Assert.assertNotEquals(basketPage, null );
    }






}
