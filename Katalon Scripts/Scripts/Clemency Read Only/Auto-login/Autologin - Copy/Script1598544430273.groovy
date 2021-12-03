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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bits-dev4qa/')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/executive-staff')

WebUI.delay(12)

WebUI.navigateToUrl('https://bits-dev4qa/Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyExecutiveStaff'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyGoStaffChecked'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInternalTools'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInvestigator'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyResearch'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencySupervisor'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'))

WebUI.delay(15)

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/support-staff')

WebUI.delay(5)

WebUI.navigateToUrl('https://bits-dev4qa/Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencySupportStaff'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyGoStaffUnChecked'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/go-staff')

WebUI.delay(5)

WebUI.navigateToUrl('https://bits-dev4qa/Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInvestigatorUnchecked'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'))

WebUI.delay(15)

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/investigator')

WebUI.delay(5)

WebUI.navigateToUrl('https://bits-dev4qa/Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SupervisorUnchecked'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'))

WebUI.delay(15)

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/supervisor')

WebUI.delay(5)

WebUI.closeBrowser()

