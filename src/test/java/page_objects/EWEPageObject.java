package page_objects;

import org.openqa.selenium.By;

public class EWEPageObject extends BasePage{

    //region Menu
    private final By orderCatalog = By.xpath("//a[contains(@class, 'c-yellow-header__link-order-catalogue')]");
    private final By headerItems = By.xpath("//a[contains(@class, 'c-yellow-header__link--arrow')]");
    private final By headerMenuLinks = By.xpath("//div[contains(@class, 'c-yellow-mega-menu--expanded')]//a[contains(@class, 'c-yellow-mega-menu__header--link')]");
    private final By headerMenuLinksMobile = By.xpath("//span[contains(@class, 'c-yellow-header__expandable-wrapper--expanded')]//a[contains(@class, 'c-yellow-mega-menu__header--link')]");
    private final By menuLinks = By.xpath("//div[contains(@class, 'c-yellow-mega-menu--expanded')]//a[@class='c-yellow-mega-menu__link']");
    private final By menuLinksMobile = By.xpath("//span[contains(@class, 'c-yellow-header__expandable-wrapper--expanded')]//a[@class='c-yellow-mega-menu__link']");
    private final By changeLanguage = By.xpath("//form[@id='languageformheader']/select");
    private final By changeLanguageMobile = By.xpath("//form[@id='languageform1']/select");
    //endregion

    //region Homepage
    private final By slideshow = By.xpath("//div[@class='c-yellow-slideshow__container']");
    //endregion

    //region Find Store
    private final By searchBox = By.xpath("//form//input[@type='search']");
    private final By searchButton = By.xpath("//form//button[@id='search']");
    private final By moreInfoButton = By.xpath("//ul[@class='slmb-item__link-list']//a[not(@target)]");
    private final By storeDetailHeading = By.xpath("//body[contains(@class,'page-type__studio-start-page')]//h1");
    private final By getDirectionLink = By.xpath("//ul[@class='slmb-item__link-list']//a[@target]");
    private final By storeName = By.xpath("//ul[@class='stores-list']/li[contains(@class,'slmb-item')][1]//h3/a");
    private final By displaySalesTab = By.xpath("//div[contains(@class, 'sub-nav')]//a[.='Display sales']");
    private final By displaySalesItems = By.xpath("//div[@class='display-sales']//div[@class='display-sales-item']/parent::a");
    private final By displaySaleHeading = By.xpath("//div[@class='article']/h2");
    //endregion

    //region Order Catalogue
    private final By catalogThumb = By.xpath("//a[@class='brochure__thumbnail']");
    private final By orderCatalogBtn = By.xpath("//div[@class='brochure__input']/button");
    private final By orderCatalogueForm = By.xpath("//form[@class='group catalog-request-step-2']");
    //endregion

    //region Product Overview
    private final By productItems = By.xpath("//a[@class='c-product-grid-item']");
    private final By pageDescription = By.xpath("//div[@class='article']");
    private final By colorVariants = By.xpath("//div[@class='c-model-details__variants']");
    //endregion

    //region COnfigurator
    private final By kitchenItems = By.xpath("//div[@class='item']/div[@class='teaser']");
    private final String configuratorFrame = "configuratorFrame";
    private final By sceneButtons = By.xpath("//div[@class='scenebutton ']");
    private final By hotspotPoints = By.xpath("//div[@class='hotspot layer']");
    private final By materialSelects = By.xpath("//div[@class='material']");
    private final By loader = By.xpath("//div[@class='loader show']");
    //endregion

    //region Kitchenality
    private final By startQuizButton = By.xpath("//button[@data-testid='popup__start__button']");
    //endregion

    //region Magazine Page
    private final By readMagazineBtn = By.xpath("//a[@class='read-more']");
    private final By backToMagazineBtn = By.xpath("//a[@class='action-button']");
    //endregion

    //region Gallery page
    private final By galleryItem = By.xpath("//li[contains(@class,'gallery-item')]/a");
    private final By loadMoreImages = By.xpath("//div[@class='load-more']");
    //endregion

    //region Getters
    @Override
    public By getSearchBox() {
        return searchBox;
    }

    public By getSearchButton() {
        return searchButton;
    }

    @Override
    public By getMoreInfoButton() {
        return moreInfoButton;
    }

    @Override
    public By getStoreDetailHeading() {
        return storeDetailHeading;
    }

    @Override
    public By getGetDirectionLink() {
        return getDirectionLink;
    }

    @Override
    public By getStoreName() {
        return storeName;
    }

    public By getOrderCatalog() {
        return orderCatalog;
    }

    public By getCatalogThumb() {
        return catalogThumb;
    }

    public By getOrderCatalogBtn() {
        return orderCatalogBtn;
    }

    @Override
    public By getOrderCatalogueForm() {
        return orderCatalogueForm;
    }

    public By getHeaderItems() {
        return headerItems;
    }

    public By getMenuLinks() {
        return menuLinks;
    }

    public By getProductItems() {
        return productItems;
    }

    public By getPageDescription() {
        return pageDescription;
    }

    public By getColorVariants() {
        return colorVariants;
    }

    public By getHeaderMenuLinks() {
        return headerMenuLinks;
    }

    public By getKitchenItems() {
        return kitchenItems;
    }

    public String getConfiguratorFrame() {
        return configuratorFrame;
    }

    public By getSceneButtons() {
        return sceneButtons;
    }

    public By getHotspotPoints() {
        return hotspotPoints;
    }

    public By getMaterialSelects() {
        return materialSelects;
    }

    public By getLoader() {
        return loader;
    }

    public By getDisplaySalesTab() {
        return displaySalesTab;
    }

    public By getDisplaySalesItems() {
        return displaySalesItems;
    }

    public By getDisplaySaleHeading() {
        return displaySaleHeading;
    }

    public By getStartQuizButton() {
        return startQuizButton;
    }

    public By getReadMagazineBtn() {
        return readMagazineBtn;
    }

    public By getBackToMagazineBtn() {
        return backToMagazineBtn;
    }

    public By getGalleryItem() {
        return galleryItem;
    }

    public By getLoadMoreImages() {
        return loadMoreImages;
    }

    public By getChangeLanguage() {
        return changeLanguage;
    }

    public By getSlideshow() {
        return slideshow;
    }

    public By getHeaderMenuLinksMobile() {
        return headerMenuLinksMobile;
    }

    public By getMenuLinksMobile() {
        return menuLinksMobile;
    }

    public By getChangeLanguageMobile() {
        return changeLanguageMobile;
    }

    //endregion
}
