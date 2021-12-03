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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHADMIN/MISCELLANEOUS/NVREFERRAL.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('BITS/Reviews-NV Referral/select_ctl00BodyuiDdlStatus'), 'Pending', false)

WebUI.sendKeys(findTestObject('BITS/Reviews-NV Referral/select_ctl00BodyuiDdlStatus'), Keys.chord(Keys.ENTER))

WebUI.delay(15)

//Validate if No Cases were found
if (WebUI.verifyElementVisible(findTestObject('BITS/Reviews-NV Referral/span_No cases were found'), FailureHandling.OPTIONAL)) {
	println('No Cases were found.')

	String NoCasesWerefound = 'No Cases were found.'

	CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesWerefound, 'Reviews>Pre-Processing>NV Referral>Pending')
	
} else {

NVRPending = WebUI.getText(findTestObject('BITS/Reviews-NV Referral/InstitutionSummary'), FailureHandling.OPTIONAL)

CustomKeywords.'myPack.WriteExcel.demoKey'(NVRPending, 'Reviews>Pre-Processing>NV Referral>Pending')

KeywordUtil.markPassed('No cases were Found')

NVR_Pending = WebUI.concatenate(((['Reviews>Pre-Processing>NV Referral>Pending: ', NVRPending]) as String[]))

println(NVR_Pending)
}

WebUI.delay(1)

WebUI.closeBrowser()

