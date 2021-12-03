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

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/support-staff')

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/span_Initiate New Case'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/div_Documents_mat-select-arrow'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/span_Pardon (Direct)'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/div_Expedite_mat-select-arrow'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/span_Single Felony'))

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Source_receivedDate'), '2/2/2020')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Personal Details_first-name'), 'a')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Middle Name_mat-input-15'), 'b')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Date Signed by Applicant_dob'), '1/2/1979')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Identifiers_mat-input-1'), 'cdcr')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Addresses_mat-input-19'), '123 S tr')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Residence Address_mat-input-20'), 'Sacramento')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_City_mat-input-21'), 'CA')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/input_Country_mat-input-22'), '95825')

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon Direct Single F/Page_/div_Zip Code_mat-checkbox-inner-container'))

