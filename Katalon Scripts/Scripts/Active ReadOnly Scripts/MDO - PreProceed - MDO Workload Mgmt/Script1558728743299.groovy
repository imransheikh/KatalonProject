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

'MDO > MDO Workload Management'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/MDO/MDOWORKLOADMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING 1400')

'Select PENDING 1400'
WebUI.selectOptionByLabel(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), 'Pending 1400', true)

WebUI.sendKeys(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

not_run: WebUI.sendKeys(findTestObject('MDO>Pre-Proceed>MDO Workload Management>Pending 1400'), Keys.chord(Keys.ENTER))

WebUI.delay(20)

Pend1400 = WebUI.getText(findTestObject('BITS/MDO-MDO Workload Mgmt/span_Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(Pend1400, 'MDO>Pre-Proceed>MDO Workload Management>Pending 1400')

MDOWM_Pending1400 = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Workload Management>Pending 1400: ', Pend1400]) as String[]))

//println(MDOWM_Pending1400)
'Select PENDING EVAL'
WebUI.selectOptionByLabel(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), 'Pending Eval', false)

WebUI.sendKeys(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(20)

PendEval = WebUI.getText(findTestObject('BITS/MDO-MDO Workload Mgmt/span_Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PendEval, 'MDO>Pre-Proceed>MDO Workload Management>Pending Eval')

MDOWM_PendingEval = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Workload Management>Pending Eval: ', PendEval]) as String[]))

//println(MDOWM_PendingEval)
'Select PENDING SIGN'
WebUI.selectOptionByLabel(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), 'Pending Sign', false)

WebUI.sendKeys(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(15)

PendSign = WebUI.getText(findTestObject('BITS/MDO-MDO Workload Mgmt/span_Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PendSign, 'MDO>Pre-Proceed>MDO Workload Management>Pending Sign')

MDOWM_PendingSign = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Workload Management>Pending Sign: ', PendSign]) as String[]))

//println(MDOWM_PendingSign)
'Select UNSCHEDULED'
WebUI.selectOptionByLabel(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), 'Unscheduled', false)

WebUI.sendKeys(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

not_run: Unscheduled = WebUI.getText(findTestObject('BITS/MDO-MDO Workload Mgmt/span_Institution Summary'))

not_run: CustomKeywords.'myPack.WriteExcel.demoKey'(Unscheduled, 'MDO>Pre-Proceed>MDO Workload Management>Unscheduled')

not_run: MDOWM_Unscheduled = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Workload Management>Unscheduled: ', Unscheduled]) as String[]))

//println(MDOWM_Unscheduled)
'Select SCHEDULED'
not_run: WebUI.selectOptionByLabel(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), 'Scheduled', 
    false)

not_run: WebUI.sendKeys(findTestObject('BITS/MDO-MDO Workload Mgmt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

not_run: WebUI.delay(15)

not_run: Scheduled = WebUI.getText(findTestObject('BITS/MDO-MDO Workload Mgmt/span_Institution Summary'))

not_run: CustomKeywords.'myPack.WriteExcel.demoKey'(Scheduled, 'MDO>Pre-Proceed>MDO Workload Management>Scheduled')

not_run: MDOWM_Scheduled = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Workload Management>Scheduled: ', Scheduled]) as String[]))

println(MDOWM_Pending1400)

println(MDOWM_PendingEval)

println(MDOWM_PendingSign)

not_run: println(MDOWM_Unscheduled)

not_run: println(MDOWM_Scheduled)

WebUI.delay(1)

WebUI.closeBrowser()

