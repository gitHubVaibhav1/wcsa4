package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import dataDrivenFramework.Flib;

public class writeExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
Flib flib=new Flib();
flib.writeExcelData("./data/actiTimeTestData.xlsx", "validcreds", 1, 2, "abc");

	}

}
