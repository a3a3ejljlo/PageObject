package pages;

import annotation.FieldName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferPhonePage extends BasePageObject {

    @FindBy(xpath = "//input[@placeholder='Номер карты отправителя']")
    @FieldName(name = "")
    public WebElement cardHolderName;

    @FindBy(xpath = "//input[@placeholder='Номер карты получателя']")
    @FieldName(name = "")
    public WebElement recipientCardNumber;

    @FindBy(xpath = "//input[@placeholder='ММ']")
    @FieldName(name = "")
    public WebElement month;

    @FindBy(xpath = "//input[@placeholder='ГГ']")
    @FieldName(name = "")
    public WebElement year;

    @FindBy(xpath = "//input[@placeholder='CVC2']")
    @FieldName(name = "")
    public WebElement cvc2;

    @FindBy(xpath = "//input[@placeholder='Сумма перевода, \u20BD']")
    @FieldName(name = "")
    public WebElement sumTransfer;

    @FindBy(xpath = "//div[text()='Заполните все поля, чтобы узнать размер комиссии']/parent::div/following-sibling::div[@class='c2c__error']")
    @FieldName(name = "")
    public WebElement minSumTransfer;

}
