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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://bitsinternal/')
'Legacy Bits'
WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'Precond: Clemency with all roles. It will go to \'Executive Staff\' dashboard.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

'Go to \'Executive\' dashboard.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Executive Staff'))

WebUI.delay(20)

//WebUI.navigateToUrl('https://bitsinternal/Bits/ADMIN/USERMANAGEMENT.ASPX')
'Go to legacy Bits to edit user roles.'
WebUI.navigateToUrl(GlobalVariable.Url + 'Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

'Leave \'Support Staff\' enabled. Remove \'Clemency Executive Staff\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyExecutiveStaff'))

'Remove \'Clemency GO Staff\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyGoStaffChecked'))

'Remove \'Clemency Internal Tools\'.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInternalTools'))

'Remove \'Clemency Investigator\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInvestigator'))

'Remove \'Clemency Research\' (Clemency Management).'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyResearch'))

'Remove \'Clemency Supervisor\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencySupervisor'))

'Save/Submit changes.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'))

WebUI.delay(20)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Support Staff'))

WebUI.delay(5)

//WebUI.navigateToUrl('https://bitsinternal/Bits/ADMIN/USERMANAGEMENT.ASPX')
'Go to legacy Bits to edit user roles.'
WebUI.navigateToUrl(GlobalVariable.Url + 'Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

'Disable \'Support Staff\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencySupportStaff'))

'Enable "GO Staff\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyGoStaffUnChecked'), 
    FailureHandling.STOP_ON_FAILURE)

'Save/Submit changes.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

'Go to \'Go Staff\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_GO Staff'))

WebUI.delay(5)

//WebUI.navigateToUrl('https://bitsinternal/Bits/ADMIN/USERMANAGEMENT.ASPX')
WebUI.navigateToUrl(GlobalVariable.Url + 'Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

'Disable \'GO Staff\'.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyGoStaffChecked'))

'Enable \'Investigator\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInvestigatorUnchecked'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'))

WebUI.delay(20)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

'Go to \'Investigator\' dashboard.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Investigator'))

WebUI.delay(5)

//WebUI.navigateToUrl('https://bitsinternal/Bits/ADMIN/USERMANAGEMENT.ASPX')
WebUI.navigateToUrl(GlobalVariable.Url + 'Bits/ADMIN/USERMANAGEMENT.ASPX')

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Active Only_ctl00BodybtnEdit'))

WebUI.delay(3)

'Disable \'Investigator\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ClemencyInvestigator'))

'Enable \'Supervisor\' role.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SupervisorUnchecked'))

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SubmitReload'))

WebUI.delay(20)

WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Clemency'))

'Go to \'Supervisor\' dashboard.'
WebUI.click(findTestObject('Clemency Read Only/Auto-login/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Supervisor'))

WebUI.delay(5)

//WebUI.navigateToUrl('https://bitsinternal/Bits/')
WebUI.navigateToUrl(GlobalVariable.Url + 'Bits/')

WebUI.delay(3)

WebUI.closeBrowser()

