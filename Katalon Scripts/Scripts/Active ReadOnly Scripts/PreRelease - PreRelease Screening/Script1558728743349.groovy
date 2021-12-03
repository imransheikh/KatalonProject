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

not_run: WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiStatusDDL'), 'Unscreened', 
    false)

not_run: WebUI.selectOptionByLabel(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), 
    'Classification', false)

not_run: WebUI.sendKeys(findTestObject('BITS/PreRelease-PreRelease Screening/select_ctl00BodyuiWorkgroupDDL'), Keys.chord(
        Keys.ENTER))

not_run: WebUI.delay(30)

PreRelClassification = WebUI.getText(findTestObject('BITS/PreRelease-PreRelease Screening/Show Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PreRelClassification, 'Pre-Release>Pre-Release Screening>Show Institution Summary')

PreRel_Classification = WebUI.concatenate(((['Pre-Release>Pre-Release Screening>Show Institution Summary ', PreRelClassification]) as String[]))

println(PreRel_Classification)

WebUI.delay(1)

WebUI.closeBrowser()

