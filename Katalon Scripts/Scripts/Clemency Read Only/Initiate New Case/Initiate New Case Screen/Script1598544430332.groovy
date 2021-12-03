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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/support-staff')

'Click on "Initiate New Case\' button'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/span_Initiate New Case'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/div_Documents_mat-select-arrow'))

'Select Pardon CR.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/span_Pardon (CR)'))

'Check \'Expedite\'.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/div_Expedite'))

'Expand \'Conviction Type\'.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/div_Expedite_mat-select-arrow'))

'Select \'Single Felony\'.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/span_Single Felony'))

'Expand \'Source\'.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/div_Source_mat-select-arrow-wrapper'))

'Select \'Court\'.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/span_Court'))

'Get Current date.'
String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

'Set Received Date (current date).'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Source_receivedDate'), CDATE)

'Type First Name.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Personal Details_first-name'), 'Victor')

'Type Middle Name.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_MiddleName'), 'Manuel')

'Type Last Name.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_LastName'), 'Salinas')

'Enter \'DOB\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_DOB'), '2/5/1978')

'Enter SSN.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_SSN'), '987654321')

'Enter \'Date Signed by Applicant\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_DateSignedByApplicant'), CDATE)

'Enter CDCR#'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Identifiers_mat-input-1'), 'BH6732')

'Enter CII.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_CII'), '8800AC-879b')

'Enter FBI'
WebUI.setText(findTestObject('null'), '2345-453-223')

'Enter \'Residence Address\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Addresses_mat-input-19'), '222 Market Street')

'Enter \'City\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Residence Address_mat-input-20'), 'San Francisco')

'Enter \'State\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_City_mat-input-21'), 'CA')

'Enter \'Zip Address\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Country_mat-input-22'), '95888')

'Check \'Same as Residence Address\'.'
WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/div_Zip Code_mat-checkbox-inner-container'))

'Enter \'Home\' telephone number.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Phone Numbers  Email_mat-input-4'), '123-456-7890')

'Enter \'Work\' telephone number.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_WorkTelNum'), '')

'Enter \'Cell\' telephone number.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_CellTelNum'), '')

'Enter \'Email\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_email'), 'victor.mmm223.gtrt@ggmail.com')

'Enter \'Jurisdiction\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_Jurisdiction'), 'Los Angeles')

'Enter CR number.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_CRNumber'), '')

'Enter \'Hearing Date\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_CR_hearingDT'), CDATE)

'Enter \'Judge First Name\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_JudgeFirstName'), 'Thomas')

'Enter \'Judge Last Name\'.'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/input_JudgeLastName'), 'Hook')

WebUI.verifyElementPresent(findTestObject('Clemency Read Only/Initiate/Pardon CR Single F/Page_/div_JudgeNotLegible'), 2)

WebUI.delay(3)

WebUI.closeBrowser()

