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

'Open Reviews > NV > NV JR\r\n'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHADMIN/MISCELLANEOUS/NVJURISDICTIONALREVIEW.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING')

'Select Pending'
WebUI.selectOptionByValue(findTestObject('BITS/NV JR/select_ctl00BodyuiDdlStatus'), 'P', true)

WebUI.sendKeys(findTestObject('BITS/NV JR/select_ctl00BodyuiDdlStatus'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

///
//Validate if No Cases found
if (WebUI.verifyElementVisible(findTestObject('BITS/NV JR/span_No cases were found'), FailureHandling.OPTIONAL)) {
	println('No Cases found.')

	String NoCasesfound = 'No Cases were found.'

	CustomKeywords.'myPack.WriteExcel.demoKey'(NoCasesfound, 'Reviews>Pre-Processing>NV Jurisdictional Review>Pending')

	
} else {

		Pending = WebUI.getText(findTestObject('BITS/NV JR/TotalCount'), FailureHandling.OPTIONAL)

		CustomKeywords.'myPack.WriteExcel.demoKey'(Pending, 'Reviews>Pre-Processing>NV Jurisdictional Review>Pending')

		KeywordUtil.markPassed('No Cases were Found')

		NVJR_Pending = WebUI.concatenate(((['NV JR - PENDING Institution Summary:', Pending]) as String[]))

		println(NVJR_Pending)

}

WebUI.delay(1)

WebUI.closeBrowser()

