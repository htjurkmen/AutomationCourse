package pageObjects.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPostPage {

    WebDriver driver;

    public NewPostPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".fas.fa-times")
    private WebElement closePostButton;

    @FindBy(xpath="input[formcontrolname='caption']")
    private WebElement postDescription;

    @FindBy(xpath="")
    private WebElement privatePublicButton;

    @FindBy(id="create-post")
    private WebElement createPostButton;

    @FindBy(xpath="/html/body/app-root/div[2]/app-create-post/div/div/div/form/div[2]/input")
    private WebElement fileInputField;

    public void clickOnClosePostButton(){
        closePostButton.click();
    }

    public void addPhotoToThePost(String photoName){
        fileInputField.sendKeys(photoName);
    }

    public void enterPostDescription(String description){
        postDescription.sendKeys(description);
    }

    public void clickOnPrivatePublicButton(){
        privatePublicButton.click();
    }

    public void clickOnCreatePostButton(){
        createPostButton.click();
    }

}
