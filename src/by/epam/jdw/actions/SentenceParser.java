package by.epam.jdw.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.jdw.entity.Composite;
import by.epam.jdw.entity.Paragraph;
import by.epam.jdw.entity.Sentence;

public class SentenceParser extends Parser {

	private static final Pattern SENTENCE_REGEX = Pattern.compile(" [A-Z].+?\\.");
	
	public SentenceParser(int priority) {
		super(priority);
		
	}

	@Override
	public void parse(String message, Composite composite) {
		Matcher matcher = SENTENCE_REGEX.matcher(message);
		
		while (matcher.find()) {			
			composite.addComponent(new Sentence(message.substring(matcher.start(), matcher.end())));
		//	System.out.println(message.substring(matcher.start(), matcher.end()));
		}
		
	}

}
