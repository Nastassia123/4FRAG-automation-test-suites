package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePageClass {


    private static final String APPLICATION_URL = "https://stage.4frag.ru/";

    private static final String MAX_PRICE_VALUE = "16000";

    private static final String DPI_AND_CPI_RESOLUTION_VALUE = "23000";

    private static final String BUY_PRODUCT_XPATH = "//a[text()='Купить']";

    private static final String CLOSE_BUTTON_WINDOW_LOCATOR = "//div[@id='notification-type']//button[contains(@class,'close')]";

    private static final String CARD_BUTTON_XPATH = "//span[text() = 'Корзина']";

    private static final String LOGIN_PAGE_XPATH = "//a[text() = 'Вход/регистрация']";

    private static final String ADD_TO_CAMPARASION_LIST_ICON_XPATH = "//div[contains(@class,'item-buttons center-block')]//a[contains(@class,'item-compare-btn')]";

   private static final String COMPARASION_LIST_PAGE_XPATH = "//span[text() = 'Сравнение товаров']";

    private static final String DELIVERY_PAGE_XPATH = "//span[text() = 'Сравнение товаров']";

    private static final String PAYMENT_PAGE_XPATH = "//a[text() = 'Оплата']";

    private static final String DISCOUNT_SYSTEM_PAGE_XPATH = "//a[text() = 'Система скидок']";

    private static final String WARRANTY_PAGE_XPATH = "//a[text() = 'Система скидок']";

     private static final String BOOKMARKS_PAGE_XPATH = "//span[text() = 'Закладки']";

    private static final String BASKET_PAGE_XPATH = "//span[text() = 'Корзина']";

    private static final String CATEGORY_SECTION_XPATH = "//span[contains(text(), 'Игровые мыши')]";

    private static final String CHACKBOX_BRAND_OF_CHOSEN_PRODUCT_XPATH = "//div[contains(@class, 'checkbox checkbox-success')]//input[1]";

    private static final String INPUT_MAX_PRICE_XPATH = "//input[contains(@id, 'price-max')]";

    private static final String PRODUCT_TYPE_DROPDOWN_XPATH = "//select[contains(@name, 'filter[arrtibutes][51][value][]')]";

    private static final String OPTION_FROM_PRODUCT_TYPE_XPATH = "//select[contains(@name, 'filter[arrtibutes][51][value][]')]//option[contains(text(), 'Лазерный')]";

    private static final String INPUT_DPI_AND_CPI_RESOLUTION_XPATH = "//input[contains(@id, 'at52-max')]";

    private static final String SUB_CATEGORY_OPTION_XPATH = "//div[contains(@class, 'brands-list')]//div//a[1]";

    private static final String ADDO_TO_WISH_LIST_BUTTON_XPATH = "//div[contains(@class, 'item-buttons center-block')]//a[2]";

     private static final String WISH_LIST_PAGE_XPATH = "//span[contains(text(), 'Закладки')]";

    private static final String ELEMENT_WITH_TEXT = "//*[text() = '%s']";

    public MainPage openHomePage() {
        open(APPLICATION_URL);
        return this;
    }


    public MainPage addProductToCard() {
        WebElement buyButton = waitForExpectedElement(By.xpath(String.format(BUY_PRODUCT_XPATH)));
        buyButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
}

    public MainPage closePopUpWindow() {
        WebElement closeButton = waitForExpectedElement(By.xpath(String.format(CLOSE_BUTTON_WINDOW_LOCATOR)));
        closeButton.click();
        return this;
    }


    public CardPage goToTheCardPage() {
        maximizeWindow();
        WebElement closeButton = waitForExpectedElement(By.xpath(String.format(CARD_BUTTON_XPATH)));
        closeButton.click();
        return new CardPage();
    }


    public LoginPage openLoginPage() {

        WebElement loginPage = waitForExpectedElement(By.xpath(String.format(LOGIN_PAGE_XPATH)));
        loginPage.click();
        maximizeWindow();
        return new LoginPage();
    }


    public MainPage addItemToComparasionList() {
        maximizeWindow();
        WebElement comparasionButton = waitForExpectedElement(By.xpath(String.format(ADD_TO_CAMPARASION_LIST_ICON_XPATH)));
        comparasionButton.click();
        return this;
    }

    public ComparasionListPage openComparasionListPage() {
        maximizeWindow();
        WebElement comparasionlist = waitForExpectedElement(By.xpath(String.format(COMPARASION_LIST_PAGE_XPATH)));
        comparasionlist.click();
        return new ComparasionListPage();
    }

    public DeliveryPage openDeliveryPage() {
        maximizeWindow();
        WebElement deliveryPageButton = waitForExpectedElement(By.xpath(String.format(DELIVERY_PAGE_XPATH)));
        deliveryPageButton.click();
        return new DeliveryPage();
    }

    public PaymentPage openPaymentPage() {
        maximizeWindow();
        WebElement paymentPageButton = waitForExpectedElement(By.xpath(String.format(PAYMENT_PAGE_XPATH)));
        paymentPageButton.click();
        return new PaymentPage();
    }

    public DiscountSystemPage openDiscountSystemPage() {
        maximizeWindow();
        WebElement discountSystemPageButton = waitForExpectedElement(By.xpath(String.format(DISCOUNT_SYSTEM_PAGE_XPATH)));
        discountSystemPageButton.click();
        return new DiscountSystemPage();
    }

    public WarrantyPage openWarrantyPage() {
        maximizeWindow();
        WebElement warrantyPageButton = waitForExpectedElement(By.xpath(String.format(WARRANTY_PAGE_XPATH)));
        warrantyPageButton.click();
        return new WarrantyPage();
    }

    public BookmarksPage openBookmarksPage() {
        maximizeWindow();
        WebElement bookmarksPageButton = waitForExpectedElement(By.xpath(String.format(BOOKMARKS_PAGE_XPATH)));
        bookmarksPageButton.click();
        return new BookmarksPage();
    }

    public BasketPage openBasketPage() {
        maximizeWindow();
        WebElement basketPageButton = waitForExpectedElement(By.xpath(String.format(BASKET_PAGE_XPATH)));
        basketPageButton.click();
        return new BasketPage();
    }

    public MainPage chooseProductCategory() {
        maximizeWindow();
        WebElement sectionProductButton = waitForExpectedElement(By.xpath(String.format(CATEGORY_SECTION_XPATH)));
        sectionProductButton.click();
        return this;
    }


    public MainPage checkBrandOfChosenProduct() {
        maximizeWindow();
        WebElement chooseBrandCheckbox = waitForExpectedElement(By.xpath(String.format(CHACKBOX_BRAND_OF_CHOSEN_PRODUCT_XPATH)));
        chooseBrandCheckbox.click();
        return this;
    }

    public MainPage filloutInputFormaxPrice() {
        maximizeWindow();
        WebElement fillOutMaxPrice = waitForExpectedElement(By.xpath(String.format(INPUT_MAX_PRICE_XPATH)));
        fillOutMaxPrice.sendKeys(MAX_PRICE_VALUE, Keys.ENTER);
        return this;
    }

    public MainPage clickOnTheProductTypeDropDown() {
        maximizeWindow();
        WebElement productTypeDropDown = waitForExpectedElement(By.xpath(String.format(PRODUCT_TYPE_DROPDOWN_XPATH)));
        productTypeDropDown.click();
        return this;
    }

    public MainPage chooseProductFromProductTypeDropDown() {
        maximizeWindow();
        WebElement productFromProductTypeDropDown = waitForExpectedElement(By.xpath(String.format(OPTION_FROM_PRODUCT_TYPE_XPATH)));
        productFromProductTypeDropDown.click();
        return this;
    }

    public MainPage filloutInputDPIAndCPIResolutionValue() {
        maximizeWindow();
        WebElement fillOutDPIAndCPIResolutionValue = waitForExpectedElement(By.xpath(String.format(INPUT_DPI_AND_CPI_RESOLUTION_XPATH)));
        fillOutDPIAndCPIResolutionValue.sendKeys(DPI_AND_CPI_RESOLUTION_VALUE, Keys.ENTER);
        return this;

    }


    public MainPage chooseProductSubCategoryFromResultList() {
        maximizeWindow();
        WebElement subcategoryOption = waitForExpectedElement(By.xpath(String.format(SUB_CATEGORY_OPTION_XPATH)));
        subcategoryOption.click();
        return this;
    }

    public MainPage addProductToWishListFromResultList() {
        maximizeWindow();
        WebElement wishListButton = waitForExpectedElement(By.xpath(String.format(ADDO_TO_WISH_LIST_BUTTON_XPATH)));
        wishListButton.click();
        return this;
    }

    public WishListPage openProductInTheWishListPage() {
        maximizeWindow();
        WebElement wishListPage = waitForExpectedElement(By.xpath(String.format(WISH_LIST_PAGE_XPATH)));
        wishListPage.click();
        return new WishListPage();
    }


}

