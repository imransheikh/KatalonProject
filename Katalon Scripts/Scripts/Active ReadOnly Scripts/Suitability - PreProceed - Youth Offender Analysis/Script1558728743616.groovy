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

'Suitability>Pre-Proceed>Youth Offender Analysis>Pending All'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/CASERECORDS/YOUTHOFFENDERANALYSISMGMT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING ALL ')

WebUI.selectOptionByLabel(findTestObject('BITS/Youth Offender Analysis/select_ctl00BodyuiStatusDDL'), 'Pending All', false)

WebUI.sendKeys(findTestObject('BITS/Youth Offender Analysis/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(60)

YOAPendingAll = WebUI.getText(findTestObject('BITS/Youth Offender Analysis/Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(YOAPendingAll, 'Suitability>Pre-Proceed>Youth Offender Analysis>Pending All')

YOA_PendingAll = WebUI.concatenate(((['Suitability>Pre-Proceed>Youth Offender Analysis>Pending All: ', YOAPendingAll]) as String[]))

println(YOA_PendingAll)

WebUI.delay(1)

WebUI.closeBrowser()

