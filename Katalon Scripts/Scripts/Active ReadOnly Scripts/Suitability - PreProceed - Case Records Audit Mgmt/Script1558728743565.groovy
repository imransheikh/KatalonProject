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

'Suitability>Pre-Proceed>Case Records Audit Mgmt>Pending'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/CASERECORDS/AUDITMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING ')

WebUI.selectOptionByLabel(findTestObject('BITS/Suitability-Case Records Audit Mgt/select_ctl00BodyuiStatusDDL'), 'Pending', 
    false)

WebUI.sendKeys(findTestObject('BITS/Suitability-Case Records Audit Mgt/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

String CRAMPending = WebUI.getText(findTestObject('BITS/Suitability-Case Records Audit Mgt/Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(CRAMPending, 'Suitability>Pre-Proceed>Case Records Audit Mgmt>Pending')

CRAM_Pending = WebUI.concatenate(((['Suitability>Pre-Proceed>Case Records Audit Mgmt>Pending: ', CRAMPending]) as String[]))

println(CRAM_Pending)

WebUI.delay(1)

WebUI.closeBrowser()

