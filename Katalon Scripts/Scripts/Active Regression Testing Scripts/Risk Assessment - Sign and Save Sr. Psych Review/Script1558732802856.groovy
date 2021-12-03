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

WebUI.openBrowser(GlobalVariable.Url + '/Bits/PSYCHOLOGISTS/FADRISKASSESSMENT.ASPX')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BITS Home/a_Risk Assess'))

WebUI.click(findTestObject('Object Repository/Page_BITS Home/a_Risk Assessment'))

'Filter by CRA.'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyuiTypeDDL'), 
    'CRA', true)

WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodybtnFilter'))

WebUI.delay(2)

'Click Review link from the table (column 15, row 2).'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Review'))

String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

'Enter today\'s date for Date Received by Senior Psych.'
WebUI.setText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4uiDtReceivedSPsTxt'), 
    CDATE)

println('CurrentDate: ' + CDATE)

'Enter today\'s date for Date Approved by Senior Psych'
WebUI.setText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4uiDtApprovedSPsTxt'), 
    CDATE)

WebUI.delay(2)

println('CurrentDate: ' + CDATE)

'Enter Supervisory Review Duration.'
WebUI.setText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4uiReviewDurationTxt'), 
    '.25')

WebUI.delay(2)

'Clikc on Yes on Scoring Data Reviewed.'
WebUI.selectOptionByLabel(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyRiskAssessmentTabsuiTab4uiScoreReviewedDdlDD'), 
    'Yes', false)

WebUI.delay(2)

'Check Yes on Source Documents Reviewed.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4grpDocReviewed'))

WebUI.delay(2)

'Check No for Elderky Parole Consideration.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4grpEOConsideration'))

WebUI.delay(3)

'Check No for Youth Offender Consideration.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4grpYOConsideration'))

WebUI.delay(3)

'Type something in the Comments area.'
WebUI.setText(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_Test'), 'This is a test.')

'Click on Documents link.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Documents'))

WebUI.delay(20)

'Click on New Document.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_New Document'))

WebUI.delay(10)

'From the Document Type dropdown list, select CRA.'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyuiDocumentsCtrluiDocumentType'), 
    'EVCRA', true)

WebUI.delay(10)

'Enter todays\'s date.'
WebUI.setText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiDocumentsCtrluiDocumentReceivedDate'), 
    CDATE)

println('CurrentDate: ' + CDATE)

WebUI.delay(10)

'Type something on the Notes area.'
WebUI.setText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_ctl00BodyuiDocumentsCtrluiNotesTXT_character'), 
    'Test test test')

'Upload document.'
WebUI.uploadFile(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiDocumentsCtrluiFileLocationctl02'), 
    'C:\\Users\\miguel.oda\\Downloads\\PVDTS Regression Tests (002).pdf')

'Click on Save button.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiDocumentsCtrluiSaveDoc'))

WebUI.delay(10)

'Click on Save (document).'
WebUI.sendKeys(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiDocumentsCtrluiSaveDoc'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(15)

'Close Document Uopload window.'
WebUI.sendKeys(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyImageButton1CloseWindow'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'Click on Sign.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyRiskAssessmentTabsuiTab4uiSignTab4'))

WebUI.delay(20)

String SignedBy = WebUI.getText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Signed By RiskMgt'))

println(SignedBy)

String DateSigned = WebUI.getText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Date Signed'))

println(DateSigned)

WebUI.delay(5)

WebUI.closeBrowser()

