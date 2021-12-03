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

WebUI.navigateToUrl(GlobalVariable.Url + 'ngbits/clemency/investigator')

WebUI.waitForElementVisible(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_Open'), 0)

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String ExpectedValue = 'KatalonSW'

'To locate table'
WebElement Table = driver.findElement(By.xpath('id("cdk-accordion-child-0")/div[@class="mat-expansion-panel-body"]/mdt-dynamic-table[1]/table[@class="mat-table"]'))

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

            Columns_row.get(6).findElement(By.tagName('button')).click()

            'After getting the Expected value from Table we will Terminate the loop'
            break
        }
    }
}

WebUI.verifyElementVisible(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_COR_Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_COR_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_COR_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_DA_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_DA_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_IM_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_IM_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_IM_NA'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_ER_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_ER_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_OD_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_OD_NO'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_OD_NA'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_OD_Unknown'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-CII_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-FBI_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-FBI_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-DMV_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-NLETS_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-Lexis_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-According_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-Recomm_Yes'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-Opposit_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-Concerns_Unknown'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_BPHIV-Tel_Unknown'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_CH-Arrests_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_CH-Arrests_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_CH-Conv_No'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_CH-Conv_NA'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/div_CH-SexOff_No'))

'Click on Conviction button.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_AddConvictions'))

WebUI.waitForElementVisible(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_ConvictionModal_Add Conviction'), 
    0)

'Enter Case#'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/input_ConvitionModal_Case'), 'C88000')

'Enter Enh'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/input_ConvitionModal_Enh'), 'No')

'Enter Code'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/input_ConvictionModal_Code'), 'BP10238.6')

'Enter Jurisdiction'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/input_ConvitionModal_Jurisdiction'), 'Sacramento')

'Click on Add Conviction button'
WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_ConvictionModal_Add Conviction'))

'Close Add Conviction modal'
WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_ConvictionModal_close'))

'Click on Review Complete button'
WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_Review Complete'))

'Supervisor enter comment when signing a Review'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/textarea_SignModal_Comment'), 'This is a comment by the Supervisor signing a Review')

'Click on Review Complete button (modal)'
WebUI.click(findTestObject('ClemencyRegressionTesting/Investigator Dashboard/button_SignModal_ReviewComplete'))

WebUI.delay(2)

WebUI.closeBrowser()

