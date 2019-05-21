package test.by.epam.jwd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testttt {
	public static final Pattern	PARAGRAPH_REGEX = Pattern.compile("[A-Z].+?\\.");
	
	public static void parserrr() {
		String s = " Hello. My. Name. Is. Sasha.";
		//String[] matcher = PARAGRAPH_REGEX.split(s);
		Matcher m = PARAGRAPH_REGEX.matcher(s);
		while (m.find()) {
			System.out.println(s.substring(m.start(), m.end()));
			
		}
	}
}
