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

'Suitability>Pre-Proceed>Alert Management>Type: All, Reviewed: Not Reviewed'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/SCHEDULING/NOTIFICATIONMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Type: ALL, Reviewed: NOT REVIEWED')

WebUI.selectOptionByLabel(findTestObject('BITS/Suitability -Alert Management/select_ctl00BodyuiReviewedOptions'), 'Not Reviewed', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/Suitability -Alert Management/select_ctl00BodyuiNotificationTypes'), 'All', 
    false)

WebUI.sendKeys(findTestObject('BITS/Suitability -Alert Management/select_ctl00BodyuiNotificationTypes'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

AMAll = WebUI.getText(findTestObject('BITS/Suitability -Alert Management/uiNotificationTypeTotals'))

CustomKeywords.'myPack.WriteExcel.demoKey'(AMAll, 'Suitability>Pre-Proceed>Alert Management>Type: All, Reviewed: Not Reviewed')

AM_All = WebUI.concatenate(((['Suitability>Pre-Proceed>Alert Management>Type: All, Reviewed: Not Reviewed: ', AMAll]) as String[]))

println(AM_All)

WebUI.delay(1)

WebUI.closeBrowser()

