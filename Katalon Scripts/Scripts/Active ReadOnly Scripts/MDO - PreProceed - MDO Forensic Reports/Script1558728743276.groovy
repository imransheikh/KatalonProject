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

'MDO>Pre-Proceed>MDO Forensic Reports>Pending'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/MDO/MDOFORENSICMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Summary Count - PENDING')

WebUI.selectOptionByLabel(findTestObject('BITS/MDO-MDO Forensic Reports/select_ctl00BodyuidrpStatus'), 'Pending', false)

WebUI.sendKeys(findTestObject('BITS/MDO-MDO Forensic Reports/select_ctl00BodyuidrpStatus'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

MDOFRPending = WebUI.getText(findTestObject('BITS/MDO-MDO Forensic Reports/Summary Count'))

CustomKeywords.'myPack.WriteExcel.demoKey'(MDOFRPending, 'MDO>Pre-Proceed>MDO Forensic Reports>Pending')

MDOFR_Pending = WebUI.concatenate(((['MDO>Pre-Proceed>MDO Forensic Reports>Pending: ', MDOFRPending]) as String[]))

println(MDOFR_Pending)

WebUI.delay(1)

WebUI.closeBrowser()

