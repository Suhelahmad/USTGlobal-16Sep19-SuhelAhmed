package com.ustglobal.exception.second;

import java.io.File;
import java.io.IOException;
import java.sql.SQLDataException;

public class FileTest 
{
	void open() throws IOException, ClassNotFoundException
	{
		File f = new File("c.txt");
		f.createNewFile();
		
		Class.forName("com.a");
	}
}
