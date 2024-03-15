package com.numpyninja.codecrafters.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadDatafromFile {

	BufferedReader br;
	StringBuilder sb; 
	public ReadDatafromFile(String filePath) throws FileNotFoundException{
		if(filePath == null || filePath.isEmpty()) {
			throw new NullPointerException();
		}
		File dataFile = new File(filePath);
		if(!dataFile.exists()) {
			throw new NullPointerException();
		}
		
		
		FileReader fr = new FileReader(filePath);
		br=new BufferedReader(fr);
		
		sb = new StringBuilder();
	}
 
 
	String str;
	public String ReadData() throws IOException {
		while((str = br.readLine()) != null) {
			sb.append(str);
		}
		return sb.toString();
	}
	
	public String GetOutPutData() {
		return "Hello, World!";
	}
}