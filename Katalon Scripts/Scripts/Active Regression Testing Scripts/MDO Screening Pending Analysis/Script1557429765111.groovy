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

WebUI.openBrowser(GlobalVariable.Url + '/Bits/MDO/MDOPreScreeningManagement.aspx')

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('MDO Screening Management/select_ctl00BodyuiStatusDDL'), 'ANALYSIS', true)

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'))

WebUI.delay(15)

String cdcNumber = WebUI.getText(findTestObject('MDO Screening Management/a_CDCNumber'))

println(cdcNumber)

WebUI.click(findTestObject('MDO Screening Management/a_CDCNumber'))

WebUI.delay(40)

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl03uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl03uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl04uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl04uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl05uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl05uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl06uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl06uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl07uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl01uiOffensesctl07uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl02uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl02uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl02uiOffensesctl03uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl02uiOffensesctl03uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl02uiOffensesctl04uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl02uiOffensesctl04uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl03uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl03uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl03uiOffensesctl03uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl03uiOffensesctl03uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl04uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl04uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl04uiOffensesctl03uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl04uiOffensesctl03uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl05uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl05uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl05uiOffensesctl03uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl05uiOffensesctl03uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl06uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl06uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl06uiOffensesctl03uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl06uiOffensesctl03uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

if (WebUI.verifyElementPresent(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl07uiOffensesctl02uiMDOQualifyingOffence'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiOffensePane_contentuiRptCasesctl07uiOffensesctl02uiMDOQualifyingOffence'), 
        FailureHandling.OPTIONAL)
}

WebUI.delay(30)

WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisPotentialMDO'))

WebUI.delay(3)

WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyTabstpAnalysisuiSign'))

String signedBy = WebUI.getText(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_MDOPendingAnalysisSigned By'))

println(signedBy)

String date = WebUI.getText(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_MDOPendingAnalysisDate Signed'))

println(date)

WebUI.click(findTestObject('MDO Screening Management/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_MDOScreeningPendingAnalysisBack to Management Screen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.setText(findTestObject('MDO Screening Management/input_ctl00BodyuiCDCNumTextBox'), cdcNumber)

WebUI.delay(10)

WebUI.click(findTestObject('MDO Screening Management/input_ctl00BodybtnFilter'))

WebUI.getText(findTestObject('MDO Screening Management/span_No MDO Screenings found', [('variable') : 'No MDO Screenings found.']))

WebUI.verifyTextPresent('No MDO Screenings found.', true)

