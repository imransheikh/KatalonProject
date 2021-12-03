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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(GlobalVariable.Url + '/Bits/HEARINGS/HEARINGMANAGEMENT.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Hearing Managment/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_Type'), 'SUB', 
    true)

'Type = \'Sub\''
WebUI.sendKeys(findTestObject('Hearing Managment/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/select_Type'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('Hearing Managment/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/div_Working on your request'), 
    10)

WebUI.click(findTestObject('Hearing Managment/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Select_col9row2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementNotPresent(findTestObject('Hearing Managment/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/div_Working on your request'), 
    5)

String CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

'Hearing Date = Current Date'
WebUI.setText(findTestObject('BITS/Hearing Management/Page_Consultation/input_Hearing Date'), CDATE)

WebUI.delay(3)

'Enter Hearing Start time'
WebUI.setText(findTestObject('BITS/Hearing Management/Page_Consultation/input_Hearing Start'), '9:00')

WebUI.delay(5)

'Enter Hearing End'
WebUI.setText(findTestObject('BITS/Hearing Management/Page_Consultation/input_Hearing End'), '10 00')

WebUI.delay(3)

'Select Media = Digital'
WebUI.selectOptionByValue(findTestObject('Hearing Managment/Page_Suitability Hearing/select_SelectMedia'), 'DIGITAL', true)

WebUI.delay(2)

'Select Category = Normal'
WebUI.selectOptionByValue(findTestObject('Hearing Managment/Page_Suitability Hearing/select_Category'), 'NORMAL', true)

WebUI.delay(2)

'Click on link \'Add Recording\''
WebUI.click(findTestObject('Hearing Managment/Page_Suitability Hearing/a_AddRecording'))

WebUI.delay(5)

'Check on radio burron \'Parole Denied\''
WebUI.click(findTestObject('Hearing Managment/Page_Suitability Hearing/input_ParoleDenyRadioButton'))

WebUI.delay(3)

'Select 5 on Years'
WebUI.selectOptionByValue(findTestObject('Hearing Managment/Page_Suitability Hearing/select_Years'), '5', false)

WebUI.delay(2)

WebUI.click(findTestObject('Hearing Managment/Page_Suitability Hearing/a_AccommodationsProvided'))

WebUI.delay(2)

'Pop-up window'
WebUI.switchToWindowIndex('1')

Url = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

println(Url)

WebUI.delay(12)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Hearing Managment/Page_Suitability Hearing/input_ctl00BodyuiSign'), 5)

WebUI.sendKeys(findTestObject('Hearing Managment/Page_Suitability Hearing/input_ctl00BodyuiSign'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Hearing Managment/Page_Suitability Hearing/span_Suitability Hearing signed successfully'))

WebUI.verifyElementVisible(findTestObject('Hearing Managment/Page_Suitability Hearing/span_SignedBy'))

SignedBy = WebUI.getText(findTestObject('Hearing Managment/Page_Suitability Hearing/span_SignedBy'))

println(SignedBy)

WebUI.verifyElementVisible(findTestObject('Hearing Managment/Page_Suitability Hearing/span_SignatureDate'))

SignatureDate = WebUI.getText(findTestObject('Hearing Managment/Page_Suitability Hearing/span_SignatureDate'))

println(SignatureDate)

WebUI.click(findTestObject('Hearing Managment/Page_Suitability Hearing/input_ViewReportButton'))

WebUI.switchToWindowIndex('1')

GetURL = WebUI.getUrl()

CustomKeywords.'myPack.PDFMgment.ReadPDF'(GetURL)

WebUI.delay(30)

WebUI.switchToWindowUrl('https://bits-uat/Bits/Hearings/Suitability/Default.aspx')

WebUI.delay(10)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

