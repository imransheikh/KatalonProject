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

WebUI.openBrowser(GlobalVariable.Url+'/Bits/Default.aspx')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url+'/Bits/MDO/MDOPRESCREENINGMANAGEMENT.ASPX')

'Filter by Pending Treatment.'
WebUI.selectOptionByLabel(findTestObject('MDO Screening Management/select_ctl00BodyuiStatusDDL'), 'Pending Treatment', false)

WebUI.sendKeys(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 20)

'Sort by 5-Day Alert.'
WebUI.click(findTestObject('MDO Screening Management/a_5-Day Alert'))

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 15)

'Get CDC number.'
String cdcNumber = WebUI.getText(findTestObject('MDO Screening Management/a_CDCNumber'))

println(cdcNumber)

'Select CDC number (column 1, row 4).'
WebUI.sendKeys(findTestObject('MDO Screening Management/a_CDCNumber'), Keys.chord(Keys.ENTER))

'Does the inmate meet the 90 days of treatment criteria? = Yes (radio button).'
WebUI.check(findTestObject('MDO Screening Management/input_MDOPendingTreatmentTreatment'))

WebUI.delay(2)

'Click on Sign & Save.'
WebUI.sendKeys(findTestObject('MDO Screening Management/input_MDOPendingTreatmentSign'), Keys.chord(Keys.ENTER))

'Capture Signed by.'
String signedBy = WebUI.getText(findTestObject('MDO Screening Management/span_MDOPendingTreatmentSignedByTreatment'))

println(signedBy)

'Capture Date signed.'
String date = WebUI.getText(findTestObject('MDO Screening Management/span_MDOPendingTreatmentDateSignedTreatment'))

println(date)

'Click on Back to Management screen.'
WebUI.click(findTestObject('MDO Screening Management/a_MDO Pend Treatment Back to Management Screen'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

'Type CDC number.'
WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyuiCDCNumTextBox'), cdcNumber)

WebUI.sendKeys(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'Verify CDC number does not appear.'
WebUI.verifyTextPresent('No MDO Screenings found.', false)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

