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

'Suitability>Post-Proceed>Legal Further Review>Not Reviewed\r\n'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHADMIN/MISCELLANEOUS/SPU_LEGAL_INVST_MGMT.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('BITS/Suitability-Legal Further Review/select_ctl00BodyuiStatusDDL'), 'Not Reviewed', 
    false)

WebUI.sendKeys(findTestObject('BITS/Suitability-Legal Further Review/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

LFRNotReviewed = WebUI.getText(findTestObject('BITS/Suitability-Legal Further Review/ReviewRequestSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(LFRNotReviewed, 'Suitability>Post-Proceed>Legal Further Review>Not Reviewed')

LFR_NotReviewed = WebUI.concatenate(((['Suitability>Post-Proceed>Legal Further Review>Not Reviewed: ', LFRNotReviewed]) as String[]))

println(LFR_NotReviewed)

WebUI.delay(1)

WebUI.closeBrowser()

