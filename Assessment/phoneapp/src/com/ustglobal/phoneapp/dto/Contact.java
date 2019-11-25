package com.ustglobal.phoneapp.dto;

public class Contact {
	private String Name;
	private long Number;
	private String GroupName;
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long Number) {
		this.Number = Number;
	}
	public String getGroups() {
		return GroupName;
	}
	public void setGroups(String GroupName) {
		this.GroupName = GroupName;
	}

}
