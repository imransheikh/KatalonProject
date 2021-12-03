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

'Suitability>Pre-Proceed>ADACU Audit Management>Pending'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/CLASSIFICATION/ADACUMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary - PENDING ')

WebUI.selectOptionByLabel(findTestObject('BITS/Suitability-ADACU Audit Management/select_ctl00BodyuiStatusDDL'), 'Pending', 
    false)

WebUI.sendKeys(findTestObject('BITS/Suitability-ADACU Audit Management/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

ADACUPending = WebUI.getText(findTestObject('BITS/Suitability-ADACU Audit Management/Institution Summary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(ADACUPending,'Suitability>Pre-Proceed>ADACU Audit Management>Pending')

ADACU_Pending = WebUI.concatenate(((['Suitability>Pre-Proceed>ADACU Audit Management>Pending: ', ADACUPending]) as String[]))

println(ADACU_Pending)

WebUI.delay(1)

WebUI.closeBrowser()

