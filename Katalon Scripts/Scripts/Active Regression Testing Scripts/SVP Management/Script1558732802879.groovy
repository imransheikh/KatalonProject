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

WebUI.openBrowser(GlobalVariable.Url + '/Bits/SVP/SVPMANAGEMENT.ASPX')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('SVP Mgmt/Page_BITS - SVP Management/a_Review'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(10)

'Click on Yes (radiobutton).'
WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseAnalystScreen'))

WebUI.delay(3)

'Click on checkbox.'
WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl03uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTab'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_EditDelete_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl02uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Orange_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl03uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Orange_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl04uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Orange_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl05uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_EditDelete_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl02uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl03uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl04uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl05uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl06uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl07uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl15uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl18uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl19uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl20uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_Los Angeles_ctl00BodyuiTabSVPReviewuiTab1uiTab1SvpOffenseuiRptTabOffensectl22uiChbTabRptOffense'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

'Click on Sign & Save.'
WebUI.click(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPReviewuiTab1uiBtnTab1Sign'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementVisible(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Signed SPV Mgtmt'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Date SVP Mgmt'))

String Signed = WebUI.getText(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Signed SPV Mgtmt'))

String Dated = WebUI.getText(findTestObject('SVP Mgmt/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Date SVP Mgmt'))

println(Signed)

println(Dated)

WebUI.delay(2)

WebUI.closeBrowser()

