package com.stackroute.datamunger.query;

public class DataTypeDefinitions {

	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types
	 */
	String[] datatypes;

	public String[] getDataTypes() {
		return datatypes;
	}

	public DataTypeDefinitions(String[] datatypes) {
		super();
		this.datatypes = datatypes;
	}

	public void setDatatypes(String[] datatypes) {
		this.datatypes = datatypes;
	}
	
	
}
