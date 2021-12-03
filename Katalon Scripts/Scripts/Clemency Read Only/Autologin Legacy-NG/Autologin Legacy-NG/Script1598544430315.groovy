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

//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
WebUI.openBrowser('')

'Clear cookies'
WebUI.deleteAllCookies()

WebUI.maximizeWindow()

'Navigates to Legacy'
//WebUI.navigateToUrl('https://bits-integration/')
WebUI.navigateToUrl(GlobalVariable.Url)

'Click on \'Clemency\' menu.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_BITS Home/a_Clemency'))

'Click on \'Executive Staff\' dashboard.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_BITS Home/a_Executive Staff'))

'VALIDATION (Go to NG) - Validate \'Authorizing\' word is present in the screen.'
WebUI.verifyElementPresent(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/h3_Authorizing'), 2)

WebUI.delay(20)

'Click on hamburger icon.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/mat-icon_menu'))

'Expand BCMM.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/span_BCMM expand_more'))

'VALIDATION (Go to Legacy)  Click on \'BCMM Management\'.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/span_BCMM Management'))

'Click on \'Clemency\' menu.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

'VALIDATION (Go to NG) - Click on \'Investigator\'.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Investigator'))

'Click on hamburger icon.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/mat-icon_menu'))

'Expand BCMM.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/span_BCMM expand_more'))

'VALIDATION (Go to Legacy)  Click on \'BCMM Response\'.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/span_Print BCMM Response'))

'Click on \'Clemency\' menu.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

'Click on Supervisor\' dashboard.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Supervisor'))

WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/mat-icon_arrow_drop_down'))

'Logout.'
WebUI.click(findTestObject('Clemency Read Only/Autologin Legacy-NG/Page_/span_Logout'))

WebUI.closeBrowser()

