package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DepositListPage;

public class DepositListSteps {

    DepositListPage depositListPage = new DepositListPage();

    @When("выбран вклад \"(.*)\"")
    public void openDeposit(String depositName){
        for (WebElement item : depositListPage.depositCollection ){
            if (item.findElement(By.xpath(".//p")).getText().contains(depositName)){
                depositListPage.scrollAndClick(item.findElement(By.xpath(".//*[text()='Открыть счет']")));
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + depositName);
    }

}
