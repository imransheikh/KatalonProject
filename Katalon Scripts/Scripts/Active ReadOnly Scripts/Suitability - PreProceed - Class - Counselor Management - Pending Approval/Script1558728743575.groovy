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

'Open Suitability > Classification > Counselor Management\r\n'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/CLASSIFICATION/COUNSELORMANAGEMENTV2.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Institution Summary  - PENDING APPROVAL')

'Select Pending Aproval'
WebUI.selectOptionByLabel(findTestObject('BITS/Suitability-Class-CounselorMgt/select_AllPendingPending ApprovalCompleted'), 
    'Pending Approval', true)

WebUI.sendKeys(findTestObject('BITS/Suitability-Class-CounselorMgt/select_AllPendingPending ApprovalCompleted'), Keys.chord(
        Keys.ENTER))

WebUI.delay(60)

String CMInstitutionSummary_PendingApproval = WebUI.getText(findTestObject('BITS/Suitability-Class-CounselorMgt/TotalCount_InstitutionSummary'))

CustomKeywords.'myPack.WriteExcel.demoKey'(CMInstitutionSummary_PendingApproval, 'Suitability>Pre-Proceed>Counselor Management>Pending Approval')

CounselorMgt_ISPendingApproval = WebUI.concatenate(((['Suitability>Pre-Proceed>Counselor Management>Pending Approval:', CMInstitutionSummary_PendingApproval]) as String[]))

println(CounselorMgt_ISPendingApproval)

WebUI.delay(1)

WebUI.closeBrowser()

