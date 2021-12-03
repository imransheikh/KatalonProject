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

WebUI.openBrowser(GlobalVariable.Url + '/Bits/CLASSIFICATION/COUNSELORASSIGNMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Suitability>Pre-Proceed>Counselor Assignment>All Assigned')

WebUI.selectOptionByLabel(findTestObject('BITS/Suitability-Class-CounselorAssignment/select_ctl00BodyuiAssignedCCIDDL'), 
    'All Assigned', false)

WebUI.sendKeys(findTestObject('BITS/Suitability-Class-CounselorAssignment/select_ctl00BodyuiAssignedCCIDDL'), Keys.chord(
        Keys.ENTER))

WebUI.delay(160)

String AllAssigned = WebUI.getText(findTestObject('BITS/Suitability-Class-CounselorAssignment/TotalCount'))

CustomKeywords.'myPack.WriteExcel.demoKey'(AllAssigned, 'Suitability>Pre-Proceed>Counselor Assignment>All Assigned')

ConselorAssigmt_AllAssigned = WebUI.concatenate(((['Suitability>Pre-Proceed>Counselor Assignment>All Assigned:', AllAssigned]) as String[]))

println(ConselorAssigmt_AllAssigned)

WebUI.delay(1)

WebUI.closeBrowser()

