package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigBook;
import com.ustglobal.springcore.di.BookClass;

public class BookApp
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBook.class);
		BookClass book = context.getBean(BookClass.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPen_Name());
		
		System.out.println("************************************");
		
		System.out.println(book.getAuthor().getPen_Name());
		System.out.println(book.getAuthor().getName());
		
	}
}
