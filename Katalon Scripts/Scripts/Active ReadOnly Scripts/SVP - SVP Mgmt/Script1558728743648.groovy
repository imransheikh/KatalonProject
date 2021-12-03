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

'SVP>SVP Management>Status: Pending All, Agent: All'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/SVP/SVPMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('SVP>SVP Management>Status: Pending All, Agent: All')

WebUI.selectOptionByLabel(findTestObject('BITS/SVP-SVP Mgmt/select_ctl00BodyuiStatusDDL'), 'Pending All', false)

WebUI.selectOptionByLabel(findTestObject('BITS/SVP-SVP Mgmt/select_ctl00BodyuiDdlStaff'), 'All', false)

WebUI.sendKeys(findTestObject('BITS/SVP-SVP Mgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

SVPMAll = WebUI.getText(findTestObject('BITS/SVP-SVP Mgmt/StatusSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(SVPMAll, 'SVP>SVP Management>Status: Pending All, Agent: All')

SVPM_All = WebUI.concatenate(((['SVP>SVP Management>Status: Pending All, Agent: All: ', SVPMAll]) as String[]))

println(SVPM_All)

WebUI.delay(1)

WebUI.closeBrowser()

