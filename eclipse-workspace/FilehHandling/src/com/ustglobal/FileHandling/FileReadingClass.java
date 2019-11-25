package com.ustglobal.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass 
{
	public static void main(String[] args)
	{
	
		String path = "C:\\Users\\Suhelahmad Langoti\\Desktop\\test.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
		
			//int i = reader.read();
			int i;
			while((i=reader.read())!=-1)
			{
			System.out.print((char)i);
	    	}
//			
//			char ch1 = (char)i;
//			System.out.println(ch1);
			
//			char ch2 = (char)i2;
//			System.out.println(ch2);
//			
//			char ch3 = (char)i3;
//			System.out.println(ch3);
			
//			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//End of main Method
}//end of FileReading Class
