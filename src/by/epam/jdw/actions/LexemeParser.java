package by.epam.jdw.actions;

import java.util.regex.*;

import by.epam.jdw.entity.*;

public class LexemeParser extends Parser {

	private static final Pattern LEXEME_REGEX = Pattern.compile("[a-zA-Z].+?[\\s\\,\\.\\!\\?]");
	
	public LexemeParser(int priority) {
		super(priority);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parse(String message, Composite composite) {
		Matcher matcher = LEXEME_REGEX.matcher(message);
		while (matcher.find()) {
			composite.addComponent(new Lexeme(message.substring(matcher.start(), matcher.end())));
			//System.out.println(message.substring(matcher.start(), matcher.end()));
		}
		
	}

}
