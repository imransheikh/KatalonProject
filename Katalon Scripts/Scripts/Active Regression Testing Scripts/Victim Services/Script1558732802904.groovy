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

WebUI.openBrowser(GlobalVariable.Url+'/Bits/HEARINGPREP/VICTIMNOTICEMANAGEMENT.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Click on \'Edit\' link (row 2, column 11 from the displayed table).'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Edit'))

WebUI.waitForPageLoad(3)

'Click on \'Hearings\'.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Hearings'))

WebUI.delay(2)

'Click on \'PTA/AR/NVSS/NV\' label.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/legend_PTAARNVSSNV'))

WebUI.delay(2)

'Click on \'Victim Notices\' label.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/legend_Victim Notices'))

WebUI.delay(1)

'Click on \'View\'. Under \'Victim Notices\', click in \'View (column 7, row 2).'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_View'))

'View the PDF document.'
WebUI.switchToWindowIndex(1)

WebUI.delay(5)

'Close PDF document.'
WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

'Click on \'Edit\'. Under \'Victim Notices\', click in \'View (column 8, row 2).'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Edit_1'))

WebUI.delay(3)

'Click on \'Back to Management Screen\' link.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Back to Management Screen'))

WebUI.delay(8)

WebUI.closeBrowser()

