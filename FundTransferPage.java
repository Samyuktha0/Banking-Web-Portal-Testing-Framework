package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {
    WebDriver driver;

    @FindBy(id = "fromAccount") WebElement fromAccount;
    @FindBy(id = "toAccount") WebElement toAccount;
    @FindBy(id = "amount") WebElement amount;
    @FindBy(id = "transferBtn") WebElement transferBtn;
    @FindBy(id = "confirmationMsg") WebElement confirmationMsg;

    public FundTransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void transferFunds(String fromAcc, String toAcc, String amt) {
        fromAccount.sendKeys(fromAcc);
        toAccount.sendKeys(toAcc);
        amount.sendKeys(amt);
        transferBtn.click();
    }

    public boolean isTransferSuccessful() {
        return confirmationMsg.getText().contains("Transfer Successful");
    }
}
