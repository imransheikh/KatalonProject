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

WebUI.openBrowser(GlobalVariable.Url + '/Bits/RELEASE/RELEASEMANAGEMENT.ASPX')

WebUI.maximizeWindow()

//Status: Unscreened>Workgroup: Classification
WebUI.comment('Pre-Release>Pre-Release Screening>Status: Unscreened>Workgroup: Classification')

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 'Classification', 
    false)

WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

PreRelClassification = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelClassification, 'Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: Classification')

PreRel_Classification = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: Classification: '
            , PreRelClassification]) as String[]))

//println(PreRel_Classification)
//Status: Unscreened>Workgroup: CCHCS
WebUI.comment('Pre-Release>Pre-Release Screening>Status: Unscreened>Workgroup: CCHCS')

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 'CCHCS', 
    false)

WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

PreRelCCHCS = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelCCHCS, 'Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: CCHCS')

PreRel_CCHCS = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: CCHCS: ', PreRelCCHCS]) as String[]))

//println(PreRel_CCHCS)
//Status: Unscreened>Workgroup: BPH
WebUI.comment('Pre-Release>Pre-Release Screening>Status: Unscreened>Workgroup: BPH')

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 'BPH', 
    false)

WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

PreRelBPH = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelBPH, 'Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: BPH')

PreRel_BPH = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: BPH: ', PreRelBPH]) as String[]))

//println(PreRel_BPH)
//Status: Unscreened>Workgroup: Case Records
WebUI.comment('Pre-Release>Pre-Release Screening>Status: Unscreened>Workgroup: Case Records')

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 'Case Records', 
    false)

WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

PreRelCaseRecords = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelCaseRecords, 'Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: Case Records')

PreRel_CaseRecords = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: Case Records: '
            , PreRelCaseRecords]) as String[]))

//println(PreRel_CaseRecords)
//Status: Unscreened>Workgroup: DAPO
WebUI.comment('Pre-Release>Pre-Release Screening>Status: Unscreened>Workgroup: DAPO')

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 'DAPO', 
    false)

WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

PreRelDAPO = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelDAPO, 'Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: DAPO')

PreRel_DAPO = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: DAPO: ', PreRelDAPO]) as String[]))

//println(PreRel_DAPO)
//Status: Unscreened>Workgroup: DRP
WebUI.comment('Pre-Release>Pre-Release Screening>Status: Unscreened>Workgroup: DRP')

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 'DRP', 
    false)

WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

PreRelDRP = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelDRP, 'Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: DRP')

PreRel_DRP = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Status: Unscreened, Workgroup: DRP: ', PreRelDRP]) as String[]))

println(PreRel_Classification)

println(PreRel_CCHCS)

println(PreRel_BPH)

println(PreRel_CaseRecords)

println(PreRel_DAPO)

println(PreRel_DRP)

WebUI.delay(1)

WebUI.closeBrowser()

