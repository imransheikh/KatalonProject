package myPack
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String

public class WriteExcelCopy06012020{

	@Keyword
	public static void demoKey(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Reports\\KatalonResults.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("ReadOnlyTesting");
		if (Column_Name=='Suitability>Pre-Proceed>Case Records Audit Mgmt>Pending'){
			Row row = sheet.getRow(1);
			Cell cell = row.createCell(1);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(name);
		}

		if (Column_Name=='Suitability>Pre-Proceed>BPH Audit Management>Pending'){
			Row row2 = sheet.getRow(2);
			Cell cell2 = row2.createCell(1);
			cell2.setCellType(cell2.CELL_TYPE_STRING);
			cell2.setCellValue(name);
		}

		if (Column_Name=='Suitability>Pre-Proceed>ADACU Audit Management>Pending'){
			Row row3 = sheet.getRow(3);
			Cell cell3 = row3.createCell(1);
			cell3.setCellType(cell3.CELL_TYPE_STRING);
			cell3.setCellValue(name);
		}

		if (Column_Name=='Suitability>Pre-Proceed>Counselor Assignment>Unassigned'){
			Row row4= sheet.getRow(4);
			Cell cell4 = row4.createCell(1);
			cell4.setCellType(cell4.CELL_TYPE_STRING);
			cell4.setCellValue(name);
		}

		if (Column_Name=='Suitability>Pre-Proceed>Counselor Assignment>All Assigned'){
			Row row5 = sheet.getRow(5);
			Cell cell5 = row5.createCell(1);
			cell5.setCellType(cell5.CELL_TYPE_STRING);
			cell5.setCellValue(name);
		}

		if (Column_Name=='Suitability>Pre-Proceed>Counselor Management>Pending'){
			Row row6 = sheet.getRow(6);
			Cell cell6 = row6.createCell(1);
			cell6.setCellType(cell6.CELL_TYPE_STRING);
			cell6.setCellValue(name);
		}

		if (Column_Name=='Suitability>Pre-Proceed>Counselor Management>Pending Approval'){
			Row row7 = sheet.getRow(7);
			Cell cell7 = row7.createCell(1);
			cell7.setCellType(cell7.CELL_TYPE_STRING);
			cell7.setCellValue(name);
		}
		if (Column_Name=='Suitability>Pre-Proceed>Youth Offender Analysis>Pending All'){
			Row row8 = sheet.getRow(8);
			Cell cell8 = row8.createCell(1);
			cell8.setCellType(cell8.CELL_TYPE_STRING);
			cell8.setCellValue(name);
		}
		if (Column_Name=='Suitability>Pre-Proceed>Notice Management>Pending'){
			Row row9 = sheet.getRow(9);
			Cell cell9 = row9.createCell(1);
			cell9.setCellType(cell9.CELL_TYPE_STRING);
			cell9.setCellValue(name);
		}
		if (Column_Name=='Suitability>Pre-Proceed>Alert Management>Type: All, Reviewed: Not Reviewed'){
			Row row10 = sheet.getRow(10);
			Cell cell10 = row10.createCell(1);
			cell10.setCellType(cell10.CELL_TYPE_STRING);
			cell10.setCellValue(name);
		}
		if (Column_Name=='Suitability>Proceed>Hearing Management>Pending'){
			Row row11 = sheet.getRow(11);
			Cell cell11 = row11.createCell(1);
			cell11.setCellType(cell11.CELL_TYPE_STRING);
			cell11.setCellValue(name);
		}
		if (Column_Name=='Suitability>Post-Proceed>Decision Review>Pending DR'){
			Row row12 = sheet.getRow(12);
			Cell cell12 = row12.createCell(1);
			cell12.setCellType(cell12.CELL_TYPE_STRING);
			cell12.setCellValue(name);
		}
		if (Column_Name=='Suitability>Post-Proceed>CR Document Mgmt System>Type: Select'){
			Row row13 = sheet.getRow(13);
			Cell cell13 = row13.createCell(1);
			cell13.setCellType(cell13.CELL_TYPE_STRING);
			cell13.setCellValue(name);
		}
		if (Column_Name=='Suitability>Post-Proceed>Legal Further Review>Not Reviewed'){
			Row row14 = sheet.getRow(14);
			Cell cell14 = row14.createCell(1);
			cell14.setCellType(cell14.CELL_TYPE_STRING);
			cell14.setCellValue(name);
		}
		if (Column_Name=='Reviews>Pre-Processing>PTA Management>Pending JR'){
			Row row15 = sheet.getRow(15);
			Cell cell15 = row15.createCell(1);
			cell15.setCellType(cell15.CELL_TYPE_STRING);
			cell15.setCellValue(name);
		}
		if (Column_Name=='Reviews>Pre-Processing>PTA Management>Pending ADA'){
			Row row16 = sheet.getRow(16);
			Cell cell16 = row16.createCell(1);
			cell16.setCellType(cell16.CELL_TYPE_STRING);
			cell16.setCellValue(name);
		}
		if (Column_Name=='Reviews>Pre-Processing>NV Analysis>Pending All'){
			Row row17 = sheet.getRow(17);
			Cell cell17 = row17.createCell(1);
			cell17.setCellType(cell17.CELL_TYPE_STRING);
			cell17.setCellValue(name);
		}
		if (Column_Name=='Reviews>Pre-Processing>NV Referral>Pending'){
			Row row18 = sheet.getRow(18);
			Cell cell18 = row18.createCell(1);
			cell18.setCellType(cell18.CELL_TYPE_STRING);
			cell18.setCellValue(name);
		}
		if (Column_Name=='Reviews>Pre-Processing>NV Jurisdictional Review>Pending'){
			Row row19 = sheet.getRow(19);
			Cell cell19 = row19.createCell(1);
			cell19.setCellType(cell19.CELL_TYPE_STRING);
			cell19.setCellValue(name);
		}
		if (Column_Name=='Reviews>Pre-Processing>AR Screening Management>Pending'){
			Row row20 = sheet.getRow(20);
			Cell cell20 = row20.createCell(1);
			cell20.setCellType(cell20.CELL_TYPE_STRING);
			cell20.setCellValue(name);
		}
		if (Column_Name=='Reviews>Reviews>PTA/AR/NV/NVSS ROM>Pending'){
			Row row21 = sheet.getRow(21);
			Cell cell21 = row21.createCell(1);
			cell21.setCellType(cell21.CELL_TYPE_STRING);
			cell21.setCellValue(name);
		}
		if (Column_Name=='Medical Parole>Medical Parole Management>Pending Audit'){
			Row row22 = sheet.getRow(22);
			Cell cell22 = row22.createCell(1);
			cell22.setCellType(cell22.CELL_TYPE_STRING);
			cell22.setCellValue(name);
		}
		if (Column_Name=='Medical Parole>Medical Parole Management>Active'){
			Row row23 = sheet.getRow(23);
			Cell cell23 = row23.createCell(1);
			cell23.setCellType(cell23.CELL_TYPE_STRING);
			cell23.setCellValue(name);
		}
		if (Column_Name=='Medical Parole> Decision Review>Pending DR'){
			Row row24 = sheet.getRow(24);
			Cell cell24 = row24.createCell(1);
			cell24.setCellType(cell24.CELL_TYPE_STRING);
			cell24.setCellValue(name);
		}
		if (Column_Name=='MDO>Pre-Proceed>MDO Screening>Pending All'){
			Row row25 = sheet.getRow(25);
			Cell cell25 = row25.createCell(1);
			cell25.setCellType(cell25.CELL_TYPE_STRING);
			cell25.setCellValue(name);
		}
		if (Column_Name=='MDO>Pre-Proceed>MDO Screening>Alert Review'){
			Row row26 = sheet.getRow(26);
			Cell cell26 = row26.createCell(1);
			cell26.setCellType(cell26.CELL_TYPE_STRING);
			cell26.setCellValue(name);
		}
		if (Column_Name=='MDO>Pre-Proceed>MDO Workload Management>Pending 1400'){
			Row row27 = sheet.getRow(27);
			Cell cell27 = row27.createCell(1);
			cell27.setCellType(cell27.CELL_TYPE_STRING);
			cell27.setCellValue(name);
		}
		if (Column_Name=='MDO>Pre-Proceed>MDO Workload Management>Pending Eval'){
			Row row28 = sheet.getRow(28);
			Cell cell28 = row28.createCell(1);
			cell28.setCellType(cell28.CELL_TYPE_STRING);
			cell28.setCellValue(name);
		}
		if (Column_Name=='MDO>Pre-Proceed>MDO Workload Management>Pending Sign'){
			Row row29 = sheet.getRow(29);
			Cell cell29 = row29.createCell(1);
			cell29.setCellType(cell29.CELL_TYPE_STRING);
			cell29.setCellValue(name);
		}
		if (Column_Name=='MDO>Pre-Proceed>MDO Forensic Reports>Pending'){
			Row row30 = sheet.getRow(30);
			Cell cell30 = row30.createCell(1);
			cell30.setCellType(cell30.CELL_TYPE_STRING);
			cell30.setCellValue(name);
		}
		if (Column_Name=='Risk Assess>Audit>Pending'){
			Row row31 = sheet.getRow(31);
			Cell cell31 = row31.createCell(1);
			cell31.setCellType(cell31.CELL_TYPE_STRING);
			cell31.setCellValue(name);
		}
		if (Column_Name=='Risk Assess>Assignment>Pending'){
			Row row32 = sheet.getRow(32);
			Cell cell32 = row32.createCell(1);
			cell32.setCellType(cell32.CELL_TYPE_STRING);
			cell32.setCellValue(name);
		}
		if (Column_Name=='Risk Assess>Risk Assessment>Pending RA'){
			Row row33 = sheet.getRow(33);
			Cell cell33 = row33.createCell(1);
			cell33.setCellType(cell33.CELL_TYPE_STRING);
			cell33.setCellValue(name);
		}
		if (Column_Name=='Risk Assess> Risk Assessment>Pending Review'){
			Row row34 = sheet.getRow(34);
			Cell cell34 = row34.createCell(1);
			cell34.setCellType(cell34.CELL_TYPE_STRING);
			cell34.setCellValue(name);
		}
		if (Column_Name=='Transcripts>Transcript Management>Status: Pending Job Order, Staff: All'){
			Row row35 = sheet.getRow(35);
			Cell cell35 = row35.createCell(1);
			cell35.setCellType(cell35.CELL_TYPE_STRING);
			cell35.setCellValue(name);
		}
		if (Column_Name=='SVP>SVP Management>Status: Pending All, Agent: All'){
			Row row36 = sheet.getRow(36);
			Cell cell36 = row36.createCell(1);
			cell36.setCellType(cell36.CELL_TYPE_STRING);
			cell36.setCellValue(name);
		}
		if (Column_Name=='SVP>SVP Clinical Screening>Status: Pending, Psych: All'){
			Row row37 = sheet.getRow(37);
			Cell cell37 = row37.createCell(1);
			cell37.setCellType(cell37.CELL_TYPE_STRING);
			cell37.setCellValue(name);
		}
		if (Column_Name=='Investigations>IPT Management>Status: All, Agent: All '){
			Row row38 = sheet.getRow(38);
			Cell cell38 = row38.createCell(1);
			cell38.setCellType(cell38.CELL_TYPE_STRING);
			cell38.setCellValue(name);
		}
		if (Column_Name=='BCMM>BCMM Management>Pending All'){
			Row row39 = sheet.getRow(39);
			Cell cell39 = row39.createCell(1);
			cell39.setCellType(cell39.CELL_TYPE_STRING);
			cell39.setCellValue(name);
		}
		if (Column_Name=='Pre-Release>Pre-Release Screening>Show Institution Summary'){
			Row row40 = sheet.getRow(40);
			Cell cell40 = row40.createCell(1);
			cell40.setCellType(cell40.CELL_TYPE_STRING);
			cell40.setCellValue(name);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Reports\\KatalonResults.xlsx");
		workbook.write(fos);
		fos.close();
	}
}