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

WebUI.openBrowser(GlobalVariable.Url + '/Bits/Default.aspx')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_BITS Home/a_Risk Assess'))

WebUI.click(findTestObject('Object Repository/Page_BITS Home/a_Audit'))

WebUI.sendKeys(findTestObject('BITS/Risk Assess-Audit/a_Review_AuditManagement'), Keys.chord(Keys.ENTER))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/label_CRA Required'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyRiskAssessmentTabsuiTab1uiFADMonthsDDL'), 
    '07-24-2019', true)

WebUI.delay(2)

'Enter text.'
WebUI.setText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_ctl00BodyRiskAssessmentTabsuiTab1uiAuditCommentsTXT_character'), 
    'This is a test.')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab1uiSaveTab1'))

'Click on Save button.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Save successful'))

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

