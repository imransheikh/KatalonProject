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

WebUI.maximizeWindow()

WebUI.openBrowser(GlobalVariable.Url + '/Bits/MDO/MDOPRESCREENINGMANAGEMENT.ASPX')

not_run: WebUI.waitForAngularLoad(20)

not_run: VerifyOptionSelected = WebUI.verifyOptionSelectedByLabel(findTestObject('BrokenLinks/23.MDO-PreProceed-MDOScreening-PendingAll/select_Pending Treatment'), 
    'Pending Treatment', true, 0)

not_run: println(VerifyOptionSelected)

not_run: WebUI.click(findTestObject('BrokenLinks/3.Suitability-PreProceed-ADACUAuditManagement-Pending/a_Log Off'))

