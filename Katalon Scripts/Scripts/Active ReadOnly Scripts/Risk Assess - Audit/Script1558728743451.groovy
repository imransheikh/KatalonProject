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

'Risk Assess>Audit>Pending'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/PSYCHOLOGISTS/FADAUDITMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary: PENDING')

WebUI.selectOptionByLabel(findTestObject('BITS/Risk Assess-Audit/select_ctl00BodyuiStatusDDL'), 'Pending', false)

WebUI.sendKeys(findTestObject('BITS/Risk Assess-Audit/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(15)

RAAPending = WebUI.getText(findTestObject('BITS/Risk Assess-Audit/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(RAAPending, 'Risk Assess>Audit>Pending')

RAA_Pending = WebUI.concatenate(((['Risk Assess>Audit>Pending: ', RAAPending]) as String[]))

println(RAA_Pending)

WebUI.delay(1)

WebUI.closeBrowser()

