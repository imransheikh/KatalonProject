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

'Suitability>Pre-Proceeding Actions>Inmate Actions>Inmate Request Management>Pending All'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/HEARINGPREP/INMATEACTIONSCREENING.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING ALL ')

WebUI.selectOptionByLabel(findTestObject('BITS/Inmate Request Management/select_ctl00BodyuiDdlStatus'), 'Pending All', false)

WebUI.sendKeys(findTestObject('BITS/Inmate Request Management/select_ctl00BodyuiDdlStatus'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

String IRMPendingAll = WebUI.getText(findTestObject('BITS/Inmate Request Management/Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(IRMPendingAll, 'Suitability>Pre-Proceeding Actions>Inmate Actions>Inmate Request Management>Pending All')

IRM_PendingAll = WebUI.concatenate(((['Suitability>Pre-Proceed>Inmate Actions>Inmate Request Management>Pending All: ', IRMPendingAll]) as String[]))

println(IRM_PendingAll)

WebUI.delay(1)

WebUI.closeBrowser()

