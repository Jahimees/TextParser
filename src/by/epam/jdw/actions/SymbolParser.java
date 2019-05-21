package by.epam.jdw.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.jdw.entity.Composite;
import by.epam.jdw.entity.Paragraph;
import by.epam.jdw.entity.Symbol;

public class SymbolParser extends Parser {

	private static final Pattern SYMBOL_REGEX = Pattern.compile("[,.!-?]+?");
	
	public SymbolParser(int priority) {
		super(priority);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parse(String message, Composite composite) {
		Matcher matcher = SYMBOL_REGEX.matcher(message);
		System.out.println("123");
		while (matcher.find()) {
			composite.addComponent(new Symbol(message.substring(matcher.start(), matcher.end())));
			System.out.println(message.substring(matcher.start(), matcher.end()));
		}
	}

}
