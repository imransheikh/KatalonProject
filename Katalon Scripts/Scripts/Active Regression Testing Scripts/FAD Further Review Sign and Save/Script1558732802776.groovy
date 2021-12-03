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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url + '/Bits/BPHADMIN/MISCELLANEOUS/SPU_LEGAL_INVST_MGMT.ASPX')

String cdcNumber = WebUI.getText(findTestObject('FAD Further Review Sign and Save/td_FADFurherReviewCDCNumber'))

println(cdcNumber)

'Click on Review link'
WebUI.click(findTestObject('FAD Further Review Sign and Save/a_FADReviewLink'))

'Click on \'Action Required\' radio button.'
WebUI.click(findTestObject('FAD Further Review Sign and Save/input_FurtherReviewActionRequired'))

WebUI.waitForElementPresent(findTestObject('FAD Further Review Sign and Save/input_FrutherReviewiSignandSave'), 2)

'Click on Sign and Save.'
WebUI.click(findTestObject('FAD Further Review Sign and Save/input_FrutherReviewiSignandSave'))

WebUI.delay(3)

'Back to Management screen.'
WebUI.click(findTestObject('FAD Further Review Sign and Save/a_Back to Management Screen'))

'Type CDC number.'
WebUI.setText(findTestObject('FAD Further Review Sign and Save/input_BCMMCDCNumTextBox'), cdcNumber)

'Filter'
WebUI.click(findTestObject('FAD Further Review Sign and Save/input_FADFurtherReviewFilterBtn'))

'Validation to see if CDC number is found. If not, then it is a successful test.'
WebUI.getText(findTestObject('FAD Further Review Sign and Save/span_FADFurtherReviewNocasesfound'))

WebUI.verifyTextPresent('No cases found.', true)

WebUI.closeBrowser()

