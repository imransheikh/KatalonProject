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

'Open Reviews > NV > NV Analysis'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/BPHADMIN/MISCELLANEOUS/NVANALYSISMGMT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING ALL')

WebUI.selectOptionByLabel(findTestObject('BITS/NV Analysis/select_ctl00BodyuiDdlStatus'), 'Pending All', false)

WebUI.sendKeys(findTestObject('BITS/NV Analysis/select_ctl00BodyuiDdlStatus'), Keys.chord(Keys.ENTER))

WebUI.delay(20)

PendAll = WebUI.getText(findTestObject('BITS/NV Analysis/TotalCount'))

CustomKeywords.'myPack.WriteExcel.demoKey'(PendAll, 'Reviews>Pre-Processing>NV Analysis>Pending All')

NVAnalysis_PendAll = WebUI.concatenate(((['Reviews>Pre-Processing>NV Analysis>Pending All:', PendAll]) as String[]))

println(NVAnalysis_PendAll)

WebUI.delay(1)

WebUI.closeBrowser()

