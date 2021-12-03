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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bits-dev4qa/ngbits/clemency/support-staff')

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/span_Initiate New Case'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/div_Documents_mat-select-arrow'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/span_Pardon (CR)'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/div_Multiple Felony_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/span_Multiple Felony'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/div_Court_mat-select-arrow'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/span_Court'))

'Date'
String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

'Received Date'
WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Source_receivedDate'), 
    CDATE)

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Personal Details_first-name'), 
    'p')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_First Name_mat-input-14'), 
    'u')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Middle Name_mat-input-15'), 
    'o')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Date Signed by Applicant_dob'), 
    '1/22/2019')

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/div_United States of America_mat-select-arrow'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/mat-pseudo-checkbox_United Arab Emirates_mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted'))

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/mat-pseudo-checkbox_New Zealand_mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted'))

WebUI.sendKeys(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Identifiers_mat-input-1'), Keys.chord(
        Keys.ESCAPE))

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Identifiers_mat-input-1'), 
    'cdcr')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Addresses_mat-input-19'), 
    '123 Main St')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Residence Address_mat-input-20'), 
    'Sac')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_City_mat-input-21'), 
    'CA')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Country_mat-input-22'), 
    '98554')

WebUI.click(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/div_Zip Code_mat-checkbox-inner-container'))

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Certificate of Rehabilitation_mat-input-8'), 
    'Las Vegas')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Not Legible_mat-input-11'), 
    'Terrance')

WebUI.setText(findTestObject('Clemency Read Only/Initiate/Pardon CR Multiple F/Page_/input_Judge First Name_mat-input-12'), 
    'Gomez')

WebUI.closeBrowser()

