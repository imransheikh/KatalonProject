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

'SVP>SVP Clinical Screening>Status: Pending, Psych: All '
WebUI.openBrowser(GlobalVariable.Url+'/Bits/SVP/SVPEVALMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary: PENDING')

WebUI.selectOptionByLabel(findTestObject('BITS/SVP-SVP Clinical Screening/select_ctl00BodyuiDdlStatus'), 'Pending', false)

WebUI.selectOptionByLabel(findTestObject('BITS/SVP-SVP Clinical Screening/select_ctl00BodyuiDdlQueue'), 'All', false)

WebUI.selectOptionByLabel(findTestObject('BITS/SVP-SVP Clinical Screening/select_ctl00BodyuiDdlPsych'), 'All', false)

WebUI.sendKeys(findTestObject('BITS/SVP-SVP Clinical Screening/select_ctl00BodyuiDdlPsych'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

SVPCSPending = WebUI.getText(findTestObject('BITS/SVP-SVP Clinical Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(SVPCSPending, 'SVP>SVP Clinical Screening>Status: Pending, Psych: All')

SVPCS_Pending = WebUI.concatenate(((['SVP>SVP Clinical Screening>Status: Pending, Psych: All: ', SVPCSPending]) as String[]))

println(SVPCS_Pending)

WebUI.delay(1)

WebUI.closeBrowser()

