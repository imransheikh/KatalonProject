import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.openBrowser(GlobalVariable.Url + 'ngbits/clemency/investigator')

not_run: WebUI.click(findTestObject('BrokenLinks/38.Clemency-InvestigatorDashboard/button_Login'))

not_run: WebUI.click(findTestObject('BrokenLinks/38.Clemency-InvestigatorDashboard/mat-icon_menu'))

not_run: WebUI.click(findTestObject('BrokenLinks/38.Clemency-InvestigatorDashboard/span_Clemency  expand_more'))

not_run: WebUI.click(findTestObject('BrokenLinks/38.Clemency-InvestigatorDashboard/span_Investigator'))

not_run: WebUI.verifyElementPresent(findTestObject('BrokenLinks/38.Clemency-InvestigatorDashboard/span_Clemency arrow_right Investigator Dashboard'), 
    0)

