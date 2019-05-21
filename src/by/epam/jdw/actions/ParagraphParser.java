package by.epam.jdw.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.jdw.entity.Composite;
import by.epam.jdw.entity.Paragraph;

public class ParagraphParser extends Parser {

private static final Pattern PARAGRAPH_REGEX = Pattern.compile(" [A-Z].+?\n");
	
	private Composite mainComposite; 

	public ParagraphParser(int priority) {
		super(priority);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parse(String message, Composite composite) {
		Matcher matcher = PARAGRAPH_REGEX.matcher(message);
		while (matcher.find()) {
			composite.addComponent(new Paragraph(message.substring(matcher.start(), matcher.end())));
//			System.out.println(message.substring(matcher.start(), matcher.end()));
//			System.out.println();
		}
		mainComposite = composite;
	}
	
	public Composite getComposite() {
		return mainComposite;
	}
	
}
