package com.ustglobal.springcore.config;





import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.BookClass;


@Configuration
public class ConfigBook 
{
	@Bean(name = "author")
	public Author getAuthor()
	{
		Author author = new Author();
		author.setName("Suhel");
		author.setPen_Name("Suvelo");
		return author;
	}
	
	@Bean(name = "bookclass")
	public BookClass getBookClass() {
		BookClass book = new BookClass();
		book.setName("City of dreams");
		book.setPrice(111);
		book.setAuthor(getAuthor());
		return book;
	}
}
