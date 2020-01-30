package com.stackroute.datamunger.query;

public class DataTypeDefinitions {
	String[] data;

	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types
	 */

	public String[] getDataTypes() {
		return data;
		
		
	}
	
	public DataTypeDefinitions(String[] data) {
		super();
		this.data=data;
		
	}
	public void setDataTypes(String[] data) {
		this.data=data;
	}
}