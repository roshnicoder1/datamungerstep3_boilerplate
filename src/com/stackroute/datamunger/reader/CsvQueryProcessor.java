package com.stackroute.datamunger.reader;

import java.io.IOException;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;


import java.io.*;


public class CsvQueryProcessor extends QueryProcessingEngine {
	File fileName;
	

	

	// Parameterized constructor to initialize filename
	public CsvQueryProcessor(String fileName) throws IOException {
		
		this.fileName=new File(fileName);
	

	}
	
	
	

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 * Note: Return type of the method will be Header
	 */
	
	
@Override
	public Header getHeader() throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader(fileName)); 

	
		String line = br.readLine();

		String[] h = line.split(",");
		if(h.length!=-1) {
			Header header=new Header(h);
			
			return header;
			
		}
		else {
			
			return null;
		}
		 
		
	
		
		
	
		
		
		
		
		
	  
		
		

		// populate the header object with the String array containing the header names
		
	}



	/**
	 * getDataRow() method will be used in the upcoming assignments
	 */
	
	

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. If a
	 * specific field value can be converted to Integer, the data type of that field
	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
	 * then the data type of that field will contain "java.lang.Double", otherwise,
	 * the field is to be treated as String. 
	 * Note: Return Type of the method will be DataTypeDefinitions
	 */
	
	@Override
	public DataTypeDefinitions getColumnType() throws IOException{
		FileReader f;
		try {
			f=new FileReader(fileName);
			BufferedReader br1 = new BufferedReader(f); 
			String first=br1.readLine();
			String s1[]=first.split(",",18);
			
			String second=br1.readLine();
			String s2[]=second.split(",");
			String[] dtype=new String[s1.length];
			int count=0;
			for(String s:s2) {
				if(s.matches("[0-9]+")) {
					dtype[count]="java.lang.Integer";
					count++;
					}
				else {
					dtype[count]="java.lang.String";
					
					count++;
				}
				}

			for(int i=0;i<dtype.length;i++)
			{
				if(dtype[i]==null) {
					dtype[i]="java.lang.String";
					
				}
			}
			

			DataTypeDefinitions dd=new DataTypeDefinitions(dtype);
			br1.close();
			return dd;
		}
		catch(Exception e){
			
			DataTypeDefinitions dd=new DataTypeDefinitions(new String[0]);
			return dd;
		}
	
		
		
	}
	
	
	

	@Override
	public void getDataRow(){

	}

}