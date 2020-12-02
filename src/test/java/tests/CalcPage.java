package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcPage {
    @FindBy(xpath = ("//*[@jsname='VssY5c']"))
    private WebElement result;

    public CalcPage() {
    }

    public CalcPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getResult() {
        return result.getText();
    }
}
