package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.math.BigDecimal;

public class Product {
    // Implementation

    private WebDriver driver;

    public Product(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // WebElements

    @FindBy(css = "select#quantity")
    WebElement quantitySelect;

    @FindBy(css = "input#add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(id = "siNoCoverage-announce")
    WebElement noThanksButton;

    @FindBy(id = "priceblock_ourprice")
    WebElement productPrice;


    // Fields

    private String expectedProductPageTitle;

//    private BigDecimal bigDecimalProductPrice = new BigDecimal(productPrice.getText().substring(1).replace(",", ""));

//    private BigDecimal bigDecimalQuantity = new BigDecimal();

//    private BigDecimal bigDecimalCalculatedSubtotal = bigDecimalProductPrice.multiply(bigDecimalQuantity);


    // Getters

    public String getExpectedProductPageTitle() {
        return expectedProductPageTitle;
    }

    public WebElement getQuantitySelect() {
        return quantitySelect;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getNoThanksButton() {
        return noThanksButton;
    }


    // Setters

    public void setExpectedProductPageTitle(String digitalCameraProductName) {
        expectedProductPageTitle = "Amazon.com : " + digitalCameraProductName + " : Camera & Photo";
    }


    // Methods

    public void selectQuantityOfProducts(String quantity) {
        Select select = new Select(quantitySelect);
        select.selectByValue(quantity);
    }

    public void clickAddToCartButton() {
        addToCartButton.submit();
    }

    public void clickNoThanksButton() {
        noThanksButton.click();
    }
}
