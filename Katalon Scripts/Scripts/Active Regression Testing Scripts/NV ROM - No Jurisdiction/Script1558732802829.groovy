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

WebUI.openBrowser(GlobalVariable.Url+'/Bits/BPHADMIN/MISCELLANEOUS/PTAROMMANAGEMENT.ASPX')

WebUI.maximizeWindow()

'Filter by type = NV'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyuiddlType'), 
    'NV', true)

WebUI.sendKeys(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyuiddlType'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(20)

'Click on the first CDC of the table (row 1, column 1)'
WebUI.verifyElementClickable(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_ctl00BodyuiddlType'))

WebUI.sendKeys(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_CDCNumber'), Keys.chord(Keys.ENTER))

'Click on \'No\' checkbox\r\n'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/label_No'))

WebUI.delay(2)

'Type a text.'
WebUI.setText(findTestObject('Medical Parole Hearing/Page_MED Hearing/textarea_ctl00BodyjrDecisionTabstabDecisionuiRCommentsTXT_character'), 
    'This is a Test.')

WebUI.delay(2)

'Click on View ADA link.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_View ADA History'))

'DEC\'s pop up window opens.'
WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

'Close DEC\'s pop up window.'
WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

'Click on Save button.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyjrDecisionTabstabDecisionuiSave'))

WebUI.delay(2)

'Click on Sign button.'
WebUI.click(findTestObject('Object Repository/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyjrDecisionTabstabDecisionuiSign'))

WebUI.delay(7)

'Click on View Report.'
WebUI.click(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyjrDecisionTabstabDecisionuiView'))

'Read \'Signed By\' for validation purposes.'
SignedBy = WebUI.getText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Signed By'))

println(SignedBy)

'Read \'Date Signed\' for validation purposes.'
DateSigned = WebUI.getText(findTestObject('Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_DateSigned'))

println(DateSigned)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

'Close PDF report.'
WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(2)

WebUI.closeBrowser()

