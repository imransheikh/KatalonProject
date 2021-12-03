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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url + '/Bits/RELEASE/RELEASEMANAGEMENT.ASPX')

WebUI.delay(2)

String cdcNumberPreRelease = WebUI.getText(findTestObject('Pre Release Screening/a_CDCNumberPreRelease'))

println(cdcNumberPreRelease)

WebUI.delay(2)

WebUI.click(findTestObject('Pre Release Screening/a_CDCNumberPreRelease'))

WebUI.delay(2)

WebUI.check(findTestObject('Pre Release Screening/input_PreReleaseClassWorkgroupScreeningCompleteCheckBox'))

WebUI.delay(2)

WebUI.click(findTestObject('Pre Release Screening/input_PrereleaseScreeningSaveAction'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Pre Release Screening/td_PreReleaseVerifyScreened'), 'Screened')

'Leave this delay.'
WebUI.delay(2)

WebUI.click(findTestObject('Pre Release Screening/a_Pre Release Back To Management Screen'))

'Leave this delay.'
WebUI.delay(3)

WebUI.setText(findTestObject('Pre Release Screening/input_PreReleaseCDCNumTextBox'), cdcNumberPreRelease)

WebUI.delay(2)

WebUI.click(findTestObject('Pre Release Screening/input_ctl00BodybtnFilter'))

WebUI.delay(2)

WebUI.getText(findTestObject('Pre Release Screening/span_No screenings were found'))

WebUI.verifyTextPresent('No screenings were found.', true)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

