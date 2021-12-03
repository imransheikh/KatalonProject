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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url+'/Bits/Default.aspx')

WebUI.click(findTestObject('Page_BITS Home/a_Transcripts'))

'Go to Transcript Management.'
WebUI.click(findTestObject('Page_BITS Home/a_Transcript Management'))

WebUI.verifyElementClickable(findTestObject('Page_Transcript Management/select_ctl00BodyuiAssignStaffFilter'))

'Filter by Staff = All'
WebUI.selectOptionByValue(findTestObject('Page_Transcript Management/select_ctl00BodyuiAssignStaffFilter'), '-1', true)

WebUI.sendKeys(findTestObject('Page_Transcript Management/input_ctl00BodybtnFilter'), Keys.chord(Keys.ENTER))

'Click on Review (column 15, row 2)'
WebUI.click(findTestObject('Page_Transcript Management/a_Review'))

'Check Transcript Not Required checkbox.'
WebUI.click(findTestObject('Object Repository/Page_Transcript Detail/input_ctl00BodyuiNoTranscriptRequired'))

'Check Audit Completed checkbox.'
WebUI.click(findTestObject('Object Repository/Page_Transcript Detail/input_ctl00BodyuiAuditCompleted'))

'Click on Save button.'
WebUI.click(findTestObject('Object Repository/Page_Transcript Detail/input_ctl00BodyuiSave'))

WebUI.click(findTestObject('Object Repository/Page_Transcript Detail/span_Saved successfully'))

String SavedSuccessfully = WebUI.getText(findTestObject('Page_Transcript Detail/span_Saved successfully'))

println(SavedSuccessfully)

WebUI.click(findTestObject('Object Repository/Page_Transcript Detail/td_Complete'))

WebUI.closeBrowser()

