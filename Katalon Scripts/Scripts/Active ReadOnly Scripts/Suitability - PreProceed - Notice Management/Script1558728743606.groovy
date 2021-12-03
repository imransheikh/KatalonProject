import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Suitability>Pre-Proceed>Notice Management>Pending'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/HEARINGPREP/NOTICEMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING')

WebUI.selectOptionByLabel(findTestObject('BITS/Suitabiliy-NoticeMgmt/select_ctl00BodyuiStatusDDL'), 'Pending', false)

WebUI.sendKeys(findTestObject('BITS/Suitabiliy-NoticeMgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String ExpectedValue = 'PENDING'

'To locate table'
WebElement Table = driver.findElement(By.xpath('id("ctl00_Body_gvStatusCount")'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    'Loop will execute till the last cell of that specific row'
    for (int column = 0; column < columns_count; column++) {
        'It will retrieve text from each cell'
        String celltext = Columns_row.get(column).getText()

        'Checking if Cell text is matching with the expected value'
        if (celltext == ExpectedValue) {
            'Getting the Country Name if cell text i.e Company name matches with Expected value'
            println('Suitability>Pre-Proceed>Notice Management>Pending: ' + Columns_row.get(1).getText())

            String NM_Pending = Columns_row.get(1).getText()

            CustomKeywords.'myPack.WriteExcel.demoKey'(NM_Pending, 'Suitability>Pre-Proceed>Notice Management>Pending')

            'After getting the Expected value from Table we will Terminate the loop'
            break
        }
    }
}

WebUI.delay(1)

WebUI.closeBrowser()

