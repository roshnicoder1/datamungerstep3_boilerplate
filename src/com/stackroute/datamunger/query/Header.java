package com.stackroute.datamunger.query;
public class Header {
    String[] header;
    /*
     * This class should contain a member variable which is a String array, to hold
     * the headers.
     */
    
    public String[] getHeaders() {
        return header;
    }
    public Header(String[] header) {
        super();
        this.header=header;
    }
    public void setHeaders(String[] header) {
        this.header=header;
    }
}