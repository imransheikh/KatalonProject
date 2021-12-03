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

'Open Reviews > PAT/AR/NV/NVSSROM\r\n'
WebUI.openBrowser(GlobalVariable.Url + '/Bits/BPHADMIN/MISCELLANEOUS/PTAROMMANAGEMENT.ASPX')

WebUI.maximizeWindow()

WebUI.comment('Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending')

'Select Pending'
WebUI.selectOptionByValue(findTestObject('BITS/PTA-AR-NV-NVSROM/select_ctl00BodyuiStatusDDL'), 'PENDING_ROM', true)

WebUI.sendKeys(findTestObject('BITS/PTA-AR-NV-NVSROM/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

WebUI.delay(30)

Pending = WebUI.getText(findTestObject('BITS/NV JR/TotalCount'))

CustomKeywords.'myPack.WriteExcel.demoKey'(Pending, 'Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending')

PTANVSSROM_Pending = WebUI.concatenate(((['Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending:', Pending]) as String[]))

println(PTANVSSROM_Pending)

not_run: WebUI.comment('Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending ACDC')

'Select Pending ACDC'
not_run: WebUI.selectOptionByValue(findTestObject('BITS/PTA-AR-NV-NVSROM/select_ctl00BodyuiStatusDDL'), 'PENDING_ACDC', 
    true)

not_run: WebUI.sendKeys(findTestObject('BITS/PTA-AR-NV-NVSROM/select_ctl00BodyuiStatusDDL'), Keys.chord(Keys.ENTER))

not_run: WebUI.delay(20)

not_run: PendingACDC = WebUI.getText(findTestObject('BITS/NV JR/TotalCount'))

not_run: CustomKeywords.'myPack.WriteExcel.demoKey'(PendingACDC, 'Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending ACDC')

not_run: PTANVSSROM_PendingACDC = WebUI.concatenate(((['Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending ACDC:', PendingACDC]) as String[]))

not_run: println(PTANVSSROM_PendingACDC)

WebUI.delay(1)

WebUI.closeBrowser()

