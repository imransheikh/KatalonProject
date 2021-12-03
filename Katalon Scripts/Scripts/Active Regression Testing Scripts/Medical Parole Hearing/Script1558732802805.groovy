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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser(GlobalVariable.Url + '/Bits/HEARINGS/HEARINGMANAGEMENT.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Filter by Type = \'Med Parole\'.'
WebUI.selectOptionByValue(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyuiTypeDDL'), 'MED', 
    true)

WebUI.sendKeys(findTestObject('Medical Parole Hearing/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(10)

'Click on Select link (It is a table: column 9, row 2).'
WebUI.click(findTestObject('Medical Parole Hearing/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Select'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/imgctl00_Body_uiHearingDateCEImage'))

'Enter today\'s date.'
String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

WebUI.setText(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiHearingDate'), CDATE)

println('CurrentDate: ' + CDATE)

WebUI.waitForElementNotVisible(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiHearingDate'), 5)

'Enter 8:00 AM'
WebUI.setText(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiHearingStartTime'), '08 00AM')

'Enter 8:30 AM'
WebUI.setText(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiHearingEndTime'), '08 30AM')

WebUI.waitForElementClickable(findTestObject('Medical Parole Hearing/Page_MED Hearing/select_ctl00BodyuiHTMediaType'), 2)

'Media = \'CD\''
WebUI.selectOptionByLabel(findTestObject('Medical Parole Hearing/Page_MED Hearing/select_ctl00BodyuiHTMediaType'), 'CD', 
    false)

WebUI.verifyElementClickable(findTestObject('Medical Parole Hearing/Page_MED Hearing/select_ctl00BodyuiHTCategoryTypE'))

'Category = \'Normal\''
WebUI.selectOptionByValue(findTestObject('Medical Parole Hearing/Page_MED Hearing/select_ctl00BodyuiHTCategoryTypE'), 'NORMAL', 
    true)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Medical Parole Hearing/Page_MED Hearing/a_AddRecording'))

'Click on \'Add Recording\' link.'
WebUI.sendKeys(findTestObject('Medical Parole Hearing/Page_MED Hearing/a_AddRecording'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'Click on checkbox \' Disapproved\''
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/label_Disapproved'))

WebUI.waitForElementClickable(findTestObject('Medical Parole Hearing/Page_MED Hearing/span_Panel'), 3)

'Click on \'Panel\' tab.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/span_Panel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select panelist.'
WebUI.selectOptionByValue(findTestObject('Medical Parole Hearing/Page_MED Hearing/select_ctl00BodyTabstabHearingPaneluiNewPanelistName'), 
    '22765', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

'Check on Panelist chair checkbox.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyTabstabHearingPaneluiNewPanelistChair'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Add Panelist.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/a_Add Panelist'), FailureHandling.OPTIONAL)

WebUI.delay(5)

'Select second panelist.'
WebUI.selectOptionByValue(findTestObject('Medical Parole Hearing/Page_MED Hearing/select_ctl00BodyTabstabHearingPaneluiNewPanelistName'), 
    '125447', true, FailureHandling.OPTIONAL)

WebUI.delay(5)

'Add Panelist.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/a_Add Panelist'))

WebUI.delay(3)

'Click on \'Accomodations Provided\' link.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/a_Accommodations Provided'))

WebUI.delay(12)

'Open DEC\'s window.'
WebUI.switchToWindowIndex(1)

WebUI.delay(3)

'Close DEC\'s window.'
WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

'Click on \'Save\' button.'
WebUI.sendKeys(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiSave'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'Verification of Medical Parole Hearing saved.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/span_Medical Parole Hearing saved successfully'))

String MPHearingSaved = WebUI.getText(findTestObject('Medical Parole Hearing/Page_MED Hearing/span_Medical Parole Hearing saved successfully'))

println(MPHearingSaved)

WebUI.delay(2)

'Click on Sign button.'
WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiSign'))

String MPHearingSigned = WebUI.getText(findTestObject('Medical Parole Hearing/Page_MED Hearing/span_Medical Parole Hearing signed successfully'))

println(MPHearingSigned)

WebUI.delay(5)

WebUI.click(findTestObject('Medical Parole Hearing/Page_MED Hearing/input_ctl00BodyuiView'))

WebUI.delay(3)

WebUI.closeBrowser()

