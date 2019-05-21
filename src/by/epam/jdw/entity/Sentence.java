package by.epam.jdw.entity;

import java.util.regex.Pattern;

public class Sentence implements Text  {
	private String 					value;	
	public static final Pattern 	SENTENCE_REGEX = Pattern.compile(" .+?");


	public Sentence(String value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;		
	}

	public String getValue() {	
		return this.value;
	}	
}
