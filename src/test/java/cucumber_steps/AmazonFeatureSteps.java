package cucumber_steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_objects.CameraPhotoVideo;
import page_objects.Departments;
import page_objects.MainPage;

import static cucumber_steps.BeforeAfter.driver;
import static cucumber_steps.BeforeAfter.wait;
import static page_objects.MainPage.setMainPageAddress;

public class AmazonFeatureSteps {
    private MainPage mainPage = new MainPage(driver);
    private CameraPhotoVideo cameraPhotoVideo = new CameraPhotoVideo(driver);
    private Departments departments = new Departments(driver);

    @Given("^User is visiting '(.*)' site$")
    public void userIsVisitingWebAddressSite(String webAddress) {
        setMainPageAddress(webAddress);
        mainPage.goToMainPageAddress();
        wait.until(ExpectedConditions.titleIs(mainPage.getExpectedMainPageTitle()));
    }

    @When("^User goes into Best Sellers in Digital Cameras$")
    public void userGoesIntoBestSellersInDigitalCameras() {
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.getDepartmentsButton()));
        mainPage.clickDepartmentsButton();
        wait.until(ExpectedConditions.elementToBeClickable(departments.getCameraPhotoVideoLink()));
        departments.clickCameraPhotoVideoLink();
        wait.until(ExpectedConditions.elementToBeClickable(cameraPhotoVideo.getBestSellersLink()));
        cameraPhotoVideo.clickBestSellersLink();
        // TODO
    }

    @When("^User opens details of product number 'productNumber' from the list$")
    public void userOpensDetailsOfProductNumberProductNumberFromTheList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User adds 'quantity' pieces of the product to the shopping cart and gets the name and price of the product$")
    public void userAddsQuantityPiecesOfTheProductToTheShoppingCartAndGetsTheNameAndPriceOfTheProduct() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The correct product was added$")
    public void theCorrectProductWasAdded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The subtotal price sum is correct$")
    public void theSubtotalPriceSumIsCorrect() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
