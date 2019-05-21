package by.epam.jdw.entity;

import java.util.regex.Pattern;

public class Symbol implements Text  {
	private String 			value;	
	
	public Symbol(String value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;		
	}

	public String getValue() {	
		return this.value;
	}

}
