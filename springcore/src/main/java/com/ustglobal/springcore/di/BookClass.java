package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BookClass 
{
	private Author Author;
	private String Name;
	private double Price;
	
	
	@Autowired
	@Qualifier("author")
	public Author getAuthor() {
		return Author;
	}
	public void setAuthor(Author author) {
		Author = author;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	
}
