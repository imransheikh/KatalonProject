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

WebUI.openBrowser(GlobalVariable.Url+'/Bits/MED/MEDAUDITMANAGEMENT.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Institution Summary - PENDING AUDIT')

WebUI.selectOptionByLabel(findTestObject('BITS/Medical Parole-Medical Parole Management/select_ctl00BodyuiStatusDDL'), 
    'Pending Audit', false)

WebUI.sendKeys(findTestObject('BITS/Medical Parole-Medical Parole Management/select_ctl00BodyuiStatusDDL'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

//Validate if No Cases were found
if (WebUI.verifyElementVisible(findTestObject('BITS/Medical Parole-Medical Parole Management/span_No cases were found'), FailureHandling.OPTIONAL)) {
	println('No Cases were found.')

	String NoCasesWerefound = 'No Cases were found.'

	CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesWerefound, 'Medical Parole>Medical Parole Management>Pending Audit')
	
} else {

MPM_PendingAudit = WebUI.getText(findTestObject('BITS/Medical Parole-Medical Parole Management/InstitutionSummary'), 
    FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'myPack.WriteExcel.demoKey'(MPM_PendingAudit, 'Medical Parole>Medical Parole Management>Pending Audit')

MPMPendingAudit = WebUI.concatenate(((['Medical Parole>Medical Parole Management>Pending Audit: ', MPM_PendingAudit]) as String[]))

println(MPMPendingAudit)

}
WebUI.comment('Institution Summary - ACTIVE')

WebUI.selectOptionByLabel(findTestObject('BITS/Medical Parole-Medical Parole Management/select_ctl00BodyuiStatusDDL'),
	'Active', false)

WebUI.sendKeys(findTestObject('BITS/Medical Parole-Medical Parole Management/select_ctl00BodyuiStatusDDL'),
	Keys.chord(Keys.ENTER))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

//Validate if No Cases were found
if (WebUI.verifyElementVisible(findTestObject('BITS/Medical Parole-Medical Parole Management/span_No cases were found'), FailureHandling.OPTIONAL)) {
	println('No Cases were found.')

	String NoCasesWerefound = 'No Cases were found.'

	CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesWerefound, 'Medical Parole>Medical Parole Management>Pending Audit')
	
} else {

MPM_Active = WebUI.getText(findTestObject('BITS/Medical Parole-Medical Parole Management/InstitutionSummary'),
	FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'myPack.WriteExcel.demoKey'(MPM_Active, 'Medical Parole>Medical Parole Management>Active')

MPMActive = WebUI.concatenate(((['Medical Parole>Medical Parole Management>Active: ', MPM_Active]) as String[]))

println(MPMActive)
}

WebUI.delay(1)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

