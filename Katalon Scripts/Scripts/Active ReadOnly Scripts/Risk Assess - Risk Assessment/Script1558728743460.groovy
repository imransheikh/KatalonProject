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

'Risk Assess> Risk Assessment>Pending RA'
WebUI.openBrowser(GlobalVariable.Url+'/Bits/PSYCHOLOGISTS/FADRISKASSESSMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary: PENDING RA')

WebUI.selectOptionByLabel(findTestObject('BITS/Risk Assess-Assignment/select_ctl00BodyuiStatusDDL'), 'Pending RA', false)

WebUI.sendKeys(findTestObject('BITS/Risk Assess-Assignment/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

RARAPending = WebUI.getText(findTestObject('BITS/Risk Assess-Audit/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(RARAPending, 'Risk Assess>Risk Assessment>Pending RA')

RARA_Pending = WebUI.concatenate(((['Risk Assess>Risk Assessment>Pending RA: ', RARAPending]) as String[]))

//println(RARA_Pending)

WebUI.comment('Institution Summary: PENDING REVIEW')

WebUI.selectOptionByLabel(findTestObject('BITS/Risk Assess-Assignment/select_ctl00BodyuiStatusDDL'), 'Pending Review', false)

WebUI.sendKeys(findTestObject('BITS/Risk Assess-Assignment/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

RARAPendingReview = WebUI.getText(findTestObject('BITS/Risk Assess-Audit/InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(RARAPendingReview, 'Risk Assess> Risk Assessment>Pending Review')

RARA_PendingReview = WebUI.concatenate(((['Risk Assess>Risk Assessment>Pending Review: ', RARAPendingReview]) as String[]))

println(RARA_Pending)

println(RARA_PendingReview)

WebUI.delay(1)

WebUI.closeBrowser()

