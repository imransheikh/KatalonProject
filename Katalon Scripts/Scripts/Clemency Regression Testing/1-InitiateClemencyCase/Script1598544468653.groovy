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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://bitsinternal/ngbits/clemency/support-staff')
WebUI.navigateToUrl(GlobalVariable.Url + 'ngbits/clemency/support-staff')

WebUI.waitForElementVisible(findTestObject('ClemencyRegressionTesting/Support Staff/button_Initiate New Case'), 0)

'Click on "Initiate New Case\' button'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/button_Initiate New Case'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/div_Documents_mat-select-arrow'))

'Select Pardon CR.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/span_Pardon (CR)'))

'Check \'Expedite\'.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/div_Expedite'))

'Expand \'Conviction Type\'.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/div_Expedite_mat-select-arrow'))

'Select \'Single Felony\'.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/span_Single Felony'))

'Expand \'Source\'.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/div_Source_mat-select-arrow-wrapper'))

'Select \'Court\'.'
WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/span_Court'))

'Get Current date.'
String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

'Set Received Date (current date).'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Source_receivedDate'), CDATE)

'Type First Name.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Personal Details_first-name'), 'KatalonSW')

'Type Middle Name.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_MiddleName'), 'K')

'Type Last Name.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_LastName'), 'Studio')

'Enter \'DOB\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_DOB'), '2/5/1990')

'Enter SSN.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_SSN'), '123456789')

'Enter \'Date Signed by Applicant\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_DateSignedByApplicant'), CDATE)

'Enter CDCR#'
not_run: WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Identifiers_mat-input-1'), 'BH6732')

'Enter CII.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_CII'), '8800AC-879b')

'Enter FBI'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_FBI'), '2345')

'Enter \'Residence Address\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Addresses_mat-input-19'), '222 Market Street')

'Enter \'City\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Residence Address_mat-input-20'), 'San Francisco')

'Enter \'State\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_City_mat-input-21'), 'CA')

'Enter \'Zip Address\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Country_mat-input-22'), '95888')

'Check \'Same as Residence Address\'.'
WebUI.check(findTestObject('ClemencyRegressionTesting/Support Staff/div_Zip Code_mat-checkbox-inner-container'))

'Enter \'Home\' telephone number.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Phone Numbers  Email_mat-input-4'), '123-456-7890')

'Enter \'Work\' telephone number.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_WorkTelNum'), '9876543621')

'Enter \'Cell\' telephone number.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_CellTelNum'), '3258741901')

'Enter \'Email\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_email'), 'katalonstudio@ggmail.com')

'Enter \'Jurisdiction\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_Jurisdiction'), 'Los Angeles')

'Enter CR number.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_CRNumber'), '1234')

'Enter \'Hearing Date\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_CR_hearingDT'), CDATE)

'Enter \'Judge First Name\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_JudgeFirstName'), 'Judge Katalon')

'Enter \'Judge Last Name\'.'
WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_JudgeLastName'), 'Studio')

not_run: WebUI.verifyElementPresent(findTestObject('ClemencyRegressionTesting/Support Staff/div_JudgeNotLegible'), 2)

/* Uncheck expedite */
'Validate \'Date Signed by Applicant\' is cleared and disabled if user checks \'Date Not Available\'.'
not_run: WebUI.comment('Validate \'Date Signed by Applicant\' is cleared and disabled if user checks \'Date Not Available\'.')

'Check \'Date Not Available\'.'
not_run: WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/div_DateNotAvailable_mat-checkbox-inner-container'))

'Attempt to enter data.'
not_run: WebUI.setText(findTestObject('ClemencyRegressionTesting/Support Staff/input_DateSignedByApplicant'), CDATE, FailureHandling.CONTINUE_ON_FAILURE)

'Validate "Judge" First Name and Last name are cleared and disabled is user checks \'Not Legible\'.'
not_run: WebUI.comment('Validate "Judge" First Name and Last name are cleared and disabled is user checks \'Not Legible\'.')

not_run: WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/div_NotLegible_mat-checkbox-inner-container'))

WebUI.click(findTestObject('ClemencyRegressionTesting/Support Staff/button_Save'))

WebUI.closeBrowser()

