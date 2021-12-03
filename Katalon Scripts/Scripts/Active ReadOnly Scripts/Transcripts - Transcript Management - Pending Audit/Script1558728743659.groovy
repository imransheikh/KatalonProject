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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.Url+'/Bits/TRANSCRIPT/TRANSCRIPTMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Transcripts>Transcript Management>Pending Audit')

//Pending Audit
WebUI.selectOptionByLabel(findTestObject('BITS/Transcripts-Transcript Mgmt/select_ctl00BodyuiStatusDDL'), 'Pending Audit', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/Transcripts-Transcript Mgmt/select_ctl00BodyuiddlType'), 'All', false)

WebUI.selectOptionByLabel(findTestObject('BITS/Transcripts-Transcript Mgmt/select_ctl00BodyuiddlResult'), 'All', false)

WebUI.selectOptionByLabel(findTestObject('BITS/Transcripts-Transcript Mgmt/select_ctl00BodyuiAssignStaffFilter'), 'All', 
    false)

WebUI.sendKeys(findTestObject('BITS/Transcripts-Transcript Mgmt/select_ctl00BodyuiAssignStaffFilter'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

//Validate if table is empty
if (WebUI.verifyElementVisible(findTestObject('BITS/Transcripts-Transcript Mgmt/span_No recrodings found'), FailureHandling.OPTIONAL)) {
    println('No Recordings found.')

    String NoRecordingsfound = 'No Recordings found.'

    CustomKeywords.'myPack.WriteExcel.demoKey'(NoRecordingsfound, 'Transcripts>Transcript Management>Status: Pending Audit, Staff: All')
}

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String Total_PendingJobOrder = 'Total'

'To locate table'
WebElement Table = driver.findElement(By.xpath('id("ctl00_Body_FirstGrid")'))

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
    for (int column1 = 0; column1 < columns_count; column1++) {
        'It will retrieve text from each cell'
        String celltext = Columns_row.get(column1).getText()

        'Checking if Cell text is matching with the expected value'
        if (celltext == Total_PendingJobOrder) {
            'Getting the Country Name if cell text i.e Company name matches with Expected value'
            println('Transcripts>Transcript Management>Status: Pending Audit, Staff: All: ' + Columns_row.get(8).getText())

            String TM_PendingAudit = Columns_row.get(8).getText()

            CustomKeywords.'myPack.WriteExcel.demoKey'(TM_PendingAudit, 'Transcripts>Transcript Management>Status: Pending Audit, Staff: All')

            'After getting the Expected value from Table we will Terminate the loop'
            break
        }
    }
}

WebUI.delay(1)

WebUI.closeBrowser()

