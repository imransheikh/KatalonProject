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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.Url + '/Bits/Default.aspx')

WebUI.navigateToUrl(GlobalVariable.Url + '/Bits/MDO/MDOPRESCREENINGMANAGEMENT.ASPX')

WebUI.selectOptionByValue(findTestObject('MDO Screening Management/select_ctl00BodyuiStatusDDL'), 'CDCR', true)

WebUI.delay(5)

'Filter by Pending CDCR.'
WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

'Sort by column CDCR Psych.'
WebUI.click(findTestObject('MDO Screening Management/a_CDCR Psych'))

WebUI.delay(20)

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodygvMDOPreScreeningctl02chkAssignStaff'))

WebUI.delay(5)

'Get the CDC number (column 1, row 2).'
String cdcNumber = WebUI.getText(findTestObject('MDO Screening Management/a_FirstCDCNumber'))

println(cdcNumber)

WebUI.delay(2)

'Assign CDCR Psychologist = Jeanette Talbot.'
WebUI.selectOptionByLabel(findTestObject('MDO Screening Management/select_ctl00BodyddlAssignStaff'), 'ODA, MIGUEL', false)

'Click on Assign button.'
WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodybtnAssignStaff'))

WebUI.delay(25)

'Type CDC number (cdcNumber variable from step #13).'
WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyuiCDCNumTextBox'), cdcNumber)

'Click on filter.'
WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 20)

WebUI.delay(8)

'Click on CDC number (column 1, row 2).'
WebUI.click(findTestObject('MDO Screening Management/a_FirstCDCNumber'))

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 25)

'Date'
String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

'Under CDCR/DSH Evals tab/Prelim CDCR Eval, Evaluation Date = Today\'s date'
WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvaltcPrelimFinalEvaltpPrelimEvaluiPrelimCDCREvaluatorDate (1)'), 
    CDATE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvaltcPrelimFinalEvaltpPrelimEvalPrelimDSHEvaluation'), 
    2)

'DSH Evaluation Required =  Yes (radio button)'
WebUI.check(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvaltcPrelimFinalEvaltpPrelimEvalPrelimDSHEvaluation'))

WebUI.delay(2)

'Under Prelim CDCR Eval subtab, click on Sign & Save.'
WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvaltcPrelimFinalEvaltpPrelimEvaluiSign1a'))

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 15)

signedBy = WebUI.getText(findTestObject('MDO Screening Management/span_Signed By'))

println(signedBy)

String date = WebUI.getText(findTestObject('MDO Screening Management/span_Date Signed'))

println(date)

WebUI.delay(5)

'Click on Final CDCR Eval subtab.'
WebUI.click(findTestObject('MDO Screening Management/span_Final CDCR Eval'))

WebUI.delay(15)

String CDATE2 = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE2)

'Evaluation date = Today\'s date'
WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvaltcPrelimFinalEvaltpFinalEvaluiFinalCDCREvaluatorDate'), 
    CDATE2)

WebUI.delay(2)

'Question #1 = Yes'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion1Yes'))

'Question #2 = Yes'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion2Yes'))

'Question #3 = Yes'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion3Yes'))

'Question #4a = Yes'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion4aYes'))

'Question #4b = No'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion4bNo'))

'Question #5 = Yes'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion5Yes'))

'Question #6 = Yes'
WebUI.click(findTestObject('MDO Screening Management/input_FinalCDCREvaluationQuestion6Yes'))

'Check The inmate Does meet the criteria.'
WebUI.check(findTestObject('MDO Screening Management/input_MDOPendingCDCRFinalCRCREvalInmateDoesMeetTheCriteria'))

CustomKeywords.'myPack.UploadFile.uploadFile'(findTestObject('MDO Screening Management/input_CDCRDSHEvalUploadCDCREvalButton'), 
    'C:\\Users\\miguel.oda\\Downloads\\reportServer_Example.pdf')

Thread.sleep(2500)

WebUI.delay(3)

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalSignSave'))

WebUI.delay(20)

WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalRequestedDate'), CDATE)

WebUI.selectOptionByValue(findTestObject('MDO Screening Management/select_ctl00BodyTabstpCDCRDSHEvalDSHEvaluator'), '97873', 
    true)

WebUI.delay(2)

WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalDSHEvaluationDate'), CDATE)

WebUI.delay(2)

WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyTabstpDSHEvaluiFinalDSHEvalDateReceived'), CDATE)

WebUI.delay(2)

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion1EvalCriteriaNo'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion2EvalCriteriaNo'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion3EvalCriteriaNo'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion4aEvalCriteriaNo'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion4bEvalCriteriaNo'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion5EvalCriteriaNo'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalQuestion6EvalCriteriaNo'))

WebUI.check(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalInmateDoesNotMeetCriteria'))

CustomKeywords.'myPack.UploadFile.uploadFile'(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalUploadDSHEvaluationButton'), 
    'C:\\Users\\miguel.oda\\Downloads\\reportServer_Example.pdf')

Thread.sleep(2500)

//WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalUploadDSHEvaluationButton'))
WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpCDCRDSHEvalSignSave (1)'))

WebUI.delay(15)

WebUI.click(findTestObject('MDO Screening Management/span_Chief Psych Cert'))

WebUI.delay(3)

String CDATE3 = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE3)

WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyTabstpChiefCertDateCertified'), CDATE3)

WebUI.delay(5)

WebUI.check(findTestObject('MDO Screening Management/input_ctl00BodyTabstpChiefPsychCertDoesMeet'))

WebUI.check(findTestObject('MDO Screening Management/input_ctl00BodyTabstpChiefCertrbChiefEvalQ5'))

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodyTabstpChiefCertuiSignChiefCert'))

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('MDO Screening Management/a_Back to Management Screen'))

WebUI.waitForElementNotPresent(findTestObject('MDO Screening Management/div_Working on your request'), 30)

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('MDO Screening Management/select_ctl00BodyuiStatusDDL'), 'CHIEF', true)

WebUI.sendKeys(findTestObject('MDO Screening Management/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyuiCDCNumTextBox'), cdcNumber)

WebUI.delay(5)

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'))

WebUI.getText(findTestObject('MDO Screening Management/span_No MDO Screenings found', [('variable') : 'No MDO Screenings found.']))

WebUI.verifyTextPresent('No MDO Screenings found.', true)

WebUI.delay(3)

WebUI.closeBrowser()

