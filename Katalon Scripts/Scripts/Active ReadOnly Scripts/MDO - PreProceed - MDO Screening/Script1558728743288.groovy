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

'MDO > MDO Screening'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/MDO/MDOPRESCREENINGMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING ALL')

'Select Pending All'
WebUI.selectOptionByLabel(findTestObject('BITS/MDO Screening/select_ctl00BodyuiStatusDDL'), 'Pending All', false)

WebUI.sendKeys(findTestObject('BITS/MDO Screening/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(60)

PendAll = WebUI.getText(findTestObject('BITS/MDO Screening/span_InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PendAll, 'MDO>Pre-Proceed>MDO Screening>Pending All')

MDOScreening_PendAll = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Screening>Pending All: ', PendAll]) as String[]))

'Select Alert Review'
WebUI.selectOptionByLabel(findTestObject('BITS/MDO Screening/select_ctl00BodyuiStatusDDL'), 'Alert Review', false)

WebUI.sendKeys(findTestObject('BITS/MDO Screening/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(60)

AlertReview = WebUI.getText(findTestObject('BITS/MDO Screening/span_InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(AlertReview, 'MDO>Pre-Proceed>MDO Screening>Alert Review')

MDOScreening_AlertReview = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Screening>Alert Review: ', AlertReview]) as String[]))

println(MDOScreening_PendAll)

println(MDOScreening_AlertReview)

WebUI.delay(1)

WebUI.closeBrowser()

