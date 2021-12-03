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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url + '/Bits/MAIL/MAILDETAILS.ASPX')
'Type = Magazine/Periodical\r\n'
WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMgTypeDDL'), 'MAG_PRD', false)

WebUI.delay(2)

'Method Received = Email'
WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMMediaDDL'), 'EMAIL', true)

'Date'
String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

'Correspondence Date'
WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMCorrespondenceDate'), CDATE)

WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMSenderTypeDDL'), 'CDCRR', false)

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderFirstName'), 'Albert')

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderLastName'), 'Jones')

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderAddress1'), '5562 Bits Ct.')

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderCity'), 'Sacramento')

not_run: WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMSenderStateDDL'), 'CA', true)

WebUI.selectOptionByLabel(findTestObject('BCMM Detail New Correspondence/select_BCMMSenderStateDDL'), 'CA', false)

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderZipCode1'), '95830')

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderZipCode2'), '95188')

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMSenderEmailAddress'), 'AlbertJoneees@gmmmail23.com')

'CDC Number'
WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMAssocCDCNumber'), 'BC4509')

'Click on \'Search\' button.'
WebUI.click(findTestObject('BCMM Detail New Correspondence/input_BCMMSearchForCDCNumber'))

WebUI.delay(15)

'Select \'Admin Review\' (AR)'
WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMSelectTopicList'), 'AR', false)

WebUI.click(findTestObject('BCMM Detail New Correspondence/input_BCMMAddTopic'))

WebUI.delay(5)

WebUI.click(findTestObject('BCMM Detail New Correspondence/input_BCMMAssignToDivUnit'))

'Assign to Division/Unit = Admnistrative Services'
WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMDivisionDDL'), 'AS', false)

WebUI.delay(5)

'Select Procurement Unit.'
WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMAssignUnitDDL'), 'APU', false)

'Select Staff name = DERICK, NANCI'
WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMUnitAssignStaffDDL'), '88830', true)

WebUI.click(findTestObject('BCMM Detail New Correspondence/input_BCMMSave'))

WebUI.delay(20)

WebUI.click(findTestObject('BCMM Detail New Correspondence/span_BCMMActivityLog'))

'Log Number'
String logNum = WebUI.getText(findTestObject('BCMM Detail New Correspondence/span_BCMM2019-104618'), FailureHandling.STOP_ON_FAILURE)

println(logNum)

WebUI.delay(3)

'Click on Back to Manangement Screen.'
WebUI.click(findTestObject('BCMM Detail New Correspondence/a_Back to Management Screen'))

WebUI.delay(53)

'Filter by Status = Pending Response'
not_run: WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMStatus'), 'PEND_RESP', true)

'Status = Pending Response'
WebUI.selectOptionByLabel(findTestObject('BCMM Detail New Correspondence/select_BCMMStatus'), 'Pending Response', false)

'Filter by Staff = TALBOT, JEANETTE'
not_run: WebUI.selectOptionByValue(findTestObject('BCMM Detail New Correspondence/select_BCMMStaffDDL'), '271241', true)

WebUI.selectOptionByLabel(findTestObject('BCMM Detail New Correspondence/select_BCMMStaffDDL'), 'DERICK, NANCI', false)

WebUI.setText(findTestObject('BCMM Detail New Correspondence/input_BCMMCDCNumTextBox'), 'BC4509')

WebUI.click(findTestObject('BCMM Detail New Correspondence/input_BCMMFilterButton'))

WebUI.delay(55)

WebUI.click(findTestObject('BCMM Detail New Correspondence/input_BCMMFilterButton'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('BCMM Detail New Correspondence/td_BCMMLogNumbeinGrid'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

