package address.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {
    private static WebDriver driver;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "alias")
    WebElement aliasInput;

    @FindBy(name = "address1")
    WebElement address1Input;

    @FindBy(name = "city")
    WebElement cityInput;

    @FindBy(name = "postcode")
    WebElement postcodeInput;

    @FindBy(name = "id_country")
    WebElement countryInput;

    @FindBy(name = "phone")
    WebElement phoneInput;

    @FindBy(name = "submitAddress")
    WebElement saveButton;

    public void setAliasInput(String alias) {
        aliasInput.click();
        aliasInput.sendKeys(alias);
    }
    public void setAddress1Input(String address1) {
        aliasInput.click();
        address1Input.sendKeys(address1);
    }
    public void setCityInput() {
        cityInput.click();
        cityInput.sendKeys();
    }
    public void setPostcodeInput() {
        postcodeInput.click();
        postcodeInput.sendKeys();
    }
    public void setCountryInput() {
        countryInput.click();
        countryInput.sendKeys();
    }
    public void setPhoneInput() {
        phoneInput.click();
        phoneInput.sendKeys();
    }
    public void setSaveButton() {
        saveButton.click();
        saveButton.submit();
    }
}
