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

'Open Reviews > AR > AR Screening Management\r\n'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHADMIN/MISCELLANEOUS/ARSCREENINGMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING')

'Select Pending'
WebUI.selectOptionByLabel(findTestObject('BITS/AR Screening Mgt/select_ctl00BodyuiStatusDDL'), 'Pending', true)

WebUI.sendKeys(findTestObject('BITS/AR Screening Mgt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(8)

//Validate if No Cases were found
if (WebUI.verifyElementVisible(findTestObject('BITS/AR Screening Mgt/span_No cases were found'), FailureHandling.OPTIONAL)) {
	
	println('No Cases were found.')

	String NoCasesWerefound = 'No Cases were found.'

	CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesWerefound, 'Reviews>Pre-Processing>AR Screening Management>Pending')
	
} else {

Pending = WebUI.getText(findTestObject('BITS/AR Screening Mgt/TotalCount'), FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'myPack.WriteExcel.demoKey'(Pending, 'Reviews>Pre-Processing>AR Screening Management>Pending')

ARScreeningMgt_Pending = WebUI.concatenate(((['Reviews>Pre-Processing>AR Screening Management>Pending:', Pending]) as String[]))

println(ARScreeningMgt_Pending)

}

WebUI.delay(1)

WebUI.closeBrowser()

