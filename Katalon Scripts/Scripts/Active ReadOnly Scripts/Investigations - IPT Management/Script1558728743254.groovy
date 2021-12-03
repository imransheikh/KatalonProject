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

'Investigations>IPT Management>Status: All, Agent: All  '
WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHINVESTIGATION/IPTMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Investigations>IPT Management')

WebUI.selectOptionByLabel(findTestObject('BITS/Investigations-IPT Management/select_ctl00BodyuiDDlType'), 'IPT', false)

WebUI.selectOptionByLabel(findTestObject('BITS/Investigations-IPT Management/select_ctl00BodyuiStatusDDL'), 'All', false)

WebUI.selectOptionByLabel(findTestObject('BITS/Investigations-IPT Management/select_ctl00BodyuiIPTAssignedTo'), 'All', false)

WebUI.sendKeys(findTestObject('BITS/Investigations-IPT Management/select_ctl00BodyuiIPTAssignedTo'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

IPTMGMTAll = WebUI.getText(findTestObject('BITS/Investigations-IPT Management/Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(IPTMGMTAll, 'Investigations>IPT Management>Status: All, Agent: All ')

IPTMGMT_All = WebUI.concatenate(((['Investigations>IPT Management>Status: All, Agent: All: ', IPTMGMTAll]) as String[]))

println(IPTMGMT_All)

WebUI.delay(1)

WebUI.closeBrowser()

