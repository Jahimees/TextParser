package by.epam.jdw.entity;

import java.util.regex.Pattern;

public class Paragraph implements Text  {
	private String 					value;
	private static final Pattern	PARAGRAPH_REGEX = Pattern.compile("[A-Z].+?\\.");
	
	public Paragraph(String value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;		
	}

	public String getValue() {	
		return this.value;
	}

}
