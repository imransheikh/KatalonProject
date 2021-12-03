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

'Reviews > PTA Management'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHADMIN/MISCELLANEOUS/PTAJRMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Reviews>Pre-Processing>PTA Management>Pending JR')

'Select Pending JR'
WebUI.selectOptionByValue(findTestObject('BITS/PTA Management/select_ctl00BodyuiStatusDDL'), 'Pending JR', true)

WebUI.sendKeys(findTestObject('BITS/PTA Management/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

//Validate if No Cases found
if (WebUI.verifyElementVisible(findTestObject('BITS/PTA Management/span_No cases found'), FailureHandling.OPTIONAL)) {
    println('No Cases found.')

    String NoCasesfound = 'No Cases found.'

    CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesfound, 'Reviews>Pre-Processing>PTA Management>Pending JR')
	
} else {

		InstitutionSummary_PendingJR = WebUI.getText(findTestObject('BITS/PTA Management/TotalCount'), FailureHandling.OPTIONAL)

		CustomKeywords.'myPack.WriteExcel.demoKey'(InstitutionSummary_PendingJR, 'Reviews>Pre-Processing>PTA Management>Pending JR')

		KeywordUtil.markPassed('No Cases Found')

		PTAMgt_IS_PendingJR = WebUI.concatenate(((['Reviews>Pre-Processing>PTA Management>Pending JR:', InstitutionSummary_PendingJR]) as String[]))

		println(PTAMgt_IS_PendingJR)

}

//println(PTAMgt_IS_PendingJR)
WebUI.comment('Reviews>Pre-Processing>PTA Management>Pending ADA')

'Select Pending ADA'
WebUI.selectOptionByValue(findTestObject('BITS/PTA Management/select_ctl00BodyuiStatusDDL'), 'Pending ADA', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('BITS/PTA Management/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

//Validate if No Cases found
if (WebUI.verifyElementVisible(findTestObject('BITS/PTA Management/span_No cases found'), FailureHandling.OPTIONAL)) {
	println('No Cases found.')

	String NoCasesfound = 'No cases found.'

	CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesfound, 'Reviews>Pre-Processing>PTA Management>Pending ADA')
} else {

InstitutionSummary_PendingADA = WebUI.getText(findTestObject('BITS/PTA Management/TotalCount'), FailureHandling.OPTIONAL)

CustomKeywords.'myPack.WriteExcel.demoKey'(InstitutionSummary_PendingADA, 'Reviews>Pre-Processing>PTA Management>Pending ADA')

PTAMgt_IS_PendingADA = WebUI.concatenate(((['Reviews>Pre-Processing>PTA Management>Pending ADA:', InstitutionSummary_PendingADA]) as String[]))

println(PTAMgt_IS_PendingADA)

}

WebUI.delay(1)

WebUI.closeBrowser()

