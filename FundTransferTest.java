package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.FundTransferPage;
import utils.BaseTest;
import utils.DBValidator;

public class FundTransferTest extends BaseTest {
    FundTransferPage ftp;

    @BeforeMethod
    public void setupTest() {
        ftp = new FundTransferPage(driver);
    }

    @Test
    public void testFundTransfer() {
        ftp.transferFunds("123456", "654321", "1000");
        Assert.assertTrue(ftp.isTransferSuccessful());
        Assert.assertTrue(DBValidator.validateTransaction("123456", "654321", "1000"));
    }
}
