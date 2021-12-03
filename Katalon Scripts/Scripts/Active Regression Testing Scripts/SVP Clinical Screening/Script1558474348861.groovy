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

WebUI.openBrowser(GlobalVariable.Url+'/Bits/SVP/SVPEVALMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a_Review'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/label_No'))

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_Requesting AR for above SO'), 
    '**Requesting AR for above SO** test ')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Qualifying DMD'))

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t'), 
    't')

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_1'), 
    't')

WebUI.check(findTestObject('SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab2uiChkVolitional'))

WebUI.delay(3)

WebUI.click(findTestObject('SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab2uiChkEmotional'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/a__tab_ctl00_Body_uiTabSVPDetails_uiTab3'))

WebUI.delay(3)

if (WebUI.verifyElementNotChecked(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab3uiDynamicRiskRptctl01uiChkFactor'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab3uiDynamicRiskRptctl01uiChkFactor'))
} else {
    println('Element already checked')
}

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_2'), 
    't')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Protective Factors'))

if (WebUI.verifyElementNotChecked(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab4uiProtectiveFactorRptctl01uiChkFactorProFactor'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab4uiProtectiveFactorRptctl01uiChkFactorProFactor'))
} else {
    println('Element already checked')
}

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_3'), 
    't')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Additional Risk'))

if (WebUI.verifyElementNotChecked(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab5uiAdditionalRiskRptctl01uiChkFactorAddRisk'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab5uiAdditionalRiskRptctl01uiChkFactorAddRisk'))
} else {
    println('Element already checked')
}

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_4'), 
    't')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Predatory'))

if (WebUI.verifyElementNotChecked(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab6uiChkPredatory'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab6uiChkPredatory'))
} else {
    println('Element already checked')
}

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_5'), 
    't')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Static-99R'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/imgctl00_Body_uiTabSVPDetails_uiTab7_ucStatic99RCtrl_uiReleaseDTImage'))

String CDATE = new SimpleDateFormat('MM-dd-yyyy').format(Calendar.getInstance().getTime())

println('CurrentDate: ' + CDATE)

WebUI.setText(findTestObject('SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab7ucStatic99RCtrluitxtReleaseDate'), 
    CDATE)

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode1RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode2RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode3RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode4RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode5RBGConv'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode5RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode6RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode7RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode8RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode9RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_SelectCode10RBG'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/label_Score                                fairly represents the risk'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/label_Sufficient                                information to complete score'))

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_6'), 
    't')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/span_Summary'))

WebUI.setText(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/textarea_t_7'), 
    't')

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab8uiChkSeprateSexual'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab8uiQualifyingOffRbtLst'))

WebUI.delay(3)

WebUI.click(findTestObject('SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab8uiDignosableMental'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab8uiReoffendRbt'))

WebUI.delay(3)

WebUI.click(findTestObject('SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiTabSVPDetailsuiTab8uiReffDecisionRbt (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiBtnSave'))

WebUI.click(findTestObject('Object Repository/SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuiBtnSignSave'))

WebUI.delay(5)

WebUI.click(findTestObject('SVP Clinical Screening/Page_BOARDS INFORMATION TECHNOLOGY SYSTEM/input_ctl00BodyuibtnScreeningRpt'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.delay(6)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

