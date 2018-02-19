package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BestSellersBestCameraPhoto {
    // Implementation

    private WebDriver driver;

    public BestSellersBestCameraPhoto(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
