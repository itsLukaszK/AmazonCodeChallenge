package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Departments {
    // Implementation

    private WebDriver driver;

    public Departments(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // WebElements

    // TODO Move WebElement cameraPhotoVideoLink

    // Getters

    // Methods
}
