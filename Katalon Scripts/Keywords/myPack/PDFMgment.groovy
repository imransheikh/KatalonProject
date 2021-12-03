package myPack
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword

class PDFMgment {

	@Keyword
	def PDFMgment(String PDFURL) {
		URL TestURL = new URL(PDFURL);
		BufferedInputStream bis = new BufferedInputStream(TestURL.openStream());
		PDDocument doc = PDDocument.load(bis);
		String pdfText = new PDFTextStripper().getText(doc);
		doc.close();
		bis.close();
		println(pdfText);
		Assert.assertTrue(pdfText.contains("Open the setting.xml, you can see it is like this:"));
		Assert.assertTrue(pdfText.contains("Please add the following sentence in setting.xml before"));
		Assert.assertTrue(pdfText.contains("You can see that I have modified the setting.xml, and if open the file in IE, it is like this:"));
		println "PDF IS GOOD TO GO…\r";
	}
}