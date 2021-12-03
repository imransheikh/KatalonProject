import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url + 'ngbits/clemency/executive-staff')

WebUI.waitForElementVisible(findTestObject('ClemencyRegressionTesting/Executive Dashboard/table_Executive_ReviewApprovals'), 
    0)

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String ExpectedValue = 'KatalonSW'

'To locate table'
WebElement Table = driver.findElement(By.xpath('id("cdk-accordion-child-0")/div[@class="mat-expansion-panel-body"]/mdt-dynamic-table[1]/table[@class="mat-table"]'))

//id("cdk-accordion-child-0")/div[@class="mat-expansion-panel-body"]/mdt-dynamic-table[1]/table[@class="mat-table"]
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
            'Getting the Friendly Case ID'
            String CaseID = Columns_row.get(0).getText()

            println('Case ID: ' + CaseID)

            Columns_row.get(8).findElement(By.tagName('button')).click()

            'After getting the Expected value from Table we will Terminate the loop'
            break
        }
    }
}

'Click on Sign button'
WebUI.click(findTestObject('ClemencyRegressionTesting/Executive Dashboard/button_Sign'))

'Check Support checkbox'
WebUI.waitForElementVisible(findTestObject('ClemencyRegressionTesting/Executive Dashboard/textarea_ExecutiveModal_Comment'), 
    0)

'Select Support as recommendation'
WebUI.click(findTestObject('ClemencyRegressionTesting/Executive Dashboard/div_ ExecutiveModal_SupportRecomm'))

'Enter a comment'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Executive Dashboard/textarea_ExecutiveModal_Comment'), 'This is a comment by the  Executive signing a Review')

'Click on Submit to GO button'
WebUI.click(findTestObject('ClemencyRegressionTesting/Executive Dashboard/button_ExecutiveModal_SubmitToGO'))

WebUI.delay(2)

WebUI.closeBrowser()

