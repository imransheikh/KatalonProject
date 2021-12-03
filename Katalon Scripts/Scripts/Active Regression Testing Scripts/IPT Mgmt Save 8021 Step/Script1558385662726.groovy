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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url + '/Bits/BPHINVESTIGATION/IPTMANAGEMENT.ASPX')

'Filter by Status = Pending Assignment'
WebUI.selectOptionByValue(findTestObject('Page_BITS - IPT Management/select_IPTMgmt8021StatusDDL'), 'PENDING_ASSIGNMENT', 
    true)

WebUI.click(findTestObject('Page_BITS - IPT Management/input_IPTMgmt8021Filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BITS - IPT Management/a_Review'))

'Enter Received Date.'
WebUI.setText(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/input_ctl00BodyuiIptTabsuiMainTabuiRequestReceivedDate'), 
    '03-22-2019')

'Enter Prisioner Signed Date.'
WebUI.setText(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/input_ctl00BodyuiIptTabsuiMainTabuiDateSigned'), 
    '03-08-2019')

'Request from Institution = CEN'
WebUI.selectOptionByValue(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/select_ctl00BodyuiIptTabsuiMainTabuiInstitution'), 
    'CEN', true)

'Select Country of Birth.'
WebUI.selectOptionByValue(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/select_ctl00BodyuiIptTabsuiMainTabuiBirthCountry'), 
    'GT', true)

'Self Reported Nationality.'
WebUI.selectOptionByValue(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/select_ctl00BodyuiIptTabsuiMainTabuiNationality'), 
    'GY', true)

'Dual Nationality.'
WebUI.selectOptionByValue(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/select_ctl00BodyuiIptTabsuiMainTabuiDualNationality'), 
    'US', true)

'Check Prisoner Requests Transfer = Yes'
WebUI.click(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/input_ctl00BodyuiIptTabsuiMainTabGNPTRequest'))

'Check Initial Screening = Expedited Denial'
WebUI.click(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/input_ctl00BodyuiIptTabsuiMainTabGNIntitialScreening'))

'Click on Save.'
WebUI.click(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/input_ctl00BodyuiIptTabsuiMainTabui8021Save'))

WebUI.delay(3)

'Capture \'Request saved successfully\' after click on Save button.'
WebUI.verifyElementPresent(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/span_8021 Request saved successfully'), 
    2)

'Click on Back to Management Screen.'
WebUI.click(findTestObject('Page_BITS - IPT Management/Page_International Prisoner Transfer/a_Back to Management Screen'))

WebUI.closeBrowser()

