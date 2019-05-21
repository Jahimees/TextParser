package by.epam.jdw.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.jdw.entity.*;

public class WordParser extends Parser {

	private static final Pattern WORD_REGEX = Pattern.compile("[a-zA-Z]+?\\b");
	
	public WordParser(int priority) {
		super(priority);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parse(String message, Composite composite) {
		Matcher matcher = WORD_REGEX.matcher(message);
		while (matcher.find()) {
			composite.addComponent(new Word(message.substring(matcher.start(), matcher.end())));
			System.out.println(message.substring(matcher.start(), matcher.end()));
		}
	}

}
