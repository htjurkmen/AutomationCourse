package pageObjects.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="homeIcon")
    private WebElement skilloIcon;

    @FindBy(id="nav-link-home")
    private WebElement homeButton;

    @FindBy(id="nav-link-login")
    private WebElement loginButton;

    @FindBy(id="nav-link-profile")
    private WebElement profileButton;

    @FindBy(id="nav-link-new-post")
    private WebElement newPostButton;

    @FindBy(id="search-bar")
    private WebElement searchBar;

    @FindBy(css=".fas.fa-sign-out-alt.fa-lg")
    private WebElement logOutButton;

    @FindBy(css="div.post-feed-container")
    private List<WebElement> posts;

    public WebElement getLogOutButton() {
        return wait.until(ExpectedConditions.visibilityOf(logOutButton));
    }

    public void clickOnSkilloIcon(){
        skilloIcon.click();
    }

    public void clickOnHomeButton(){
        homeButton.click();
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void clickOnProfileButton(){
        profileButton.click();
    }

    public void clickOnNewPostButton(){
        newPostButton.click();
    }

    public void clickOnSignOutButton(){
        logOutButton.click();
    }

    public WebElement getPostByIndex(int index){
        return posts.get(index);
    }

    public String getPostUser(int index){
        return getPostByIndex(index).findElement(By.className("post-user")).getText();
    }

    public boolean isLogOutButtonDisplayed(){
        return logOutButton.isDisplayed();
    }
}
