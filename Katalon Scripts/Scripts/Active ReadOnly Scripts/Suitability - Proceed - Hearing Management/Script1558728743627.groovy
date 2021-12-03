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

'Suitability>Post-Proceed>Decision Review>Pending DR\r\n'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/HEARINGS/HEARINGMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING')

'Select Pending'
WebUI.selectOptionByLabel(findTestObject('BITS/Hearing Management/select_ctl00BodyuiStatusDDL'), 'Pending', true)

WebUI.sendKeys(findTestObject('BITS/Hearing Management/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

Pending = WebUI.getText(findTestObject('BITS/Hearing Management/TotalCount'))

CustomKeywords.'myPack.WriteExcel.demoKey'(Pending, 'Suitability>Proceed>Hearing Management>Pending')

HearingsMgt_Pending = WebUI.concatenate(((['Suitability>Proceed>Hearing Management>Pending:', Pending]) as String[]))

println(HearingsMgt_Pending)

WebUI.delay(1)

WebUI.closeBrowser()

